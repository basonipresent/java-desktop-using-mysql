/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import config.Connections;
import config.Constanta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 */
public class Payslip {

    // properties
    private Integer id;
    private String username;
    private String periode;
    private Float working_hour;
    private Float overtime_hour;
    private Float basic_salary;
    private Float overtime_salary;
    private Float basic_cuts;
    private Float tax_cuts;
    private Float net_salary;
    private String full_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer value) {
        this.id = value;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String value) {
        this.username = value;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String value) {
        this.periode = value;
    }

    public Float getWorkingHour() {
        return working_hour;
    }

    public void setWorkingHour(Float value) {
        this.working_hour = value;
    }

    public Float getOvertimeHour() {
        return overtime_hour;
    }

    public void setOvertimeHour(Float value) {
        this.overtime_hour = value;
    }

    public Float getBasicSalary() {
        return basic_salary;
    }

    public void setBasicSalary(Float value) {
        this.basic_salary = value;
    }

    public Float getOvertimeSalary() {
        return overtime_salary;
    }

    public void setOvertimeSalary(Float value) {
        this.overtime_salary = value;
    }

    public Float getBasicCuts() {
        return basic_cuts;
    }

    public void setBasicCuts(Float value) {
        this.basic_cuts = value;
    }

    public Float getTaxCuts() {
        return tax_cuts;
    }

    public void setTaxCuts(Float value) {
        this.tax_cuts = value;
    }

    public Float getNetSalary() {
        return net_salary;
    }

    public void setNetSalary(Float value) {
        this.net_salary = value;
    }

    public String getFullName() {
        return full_name;
    }

    public void setFullName(String value) {
        this.full_name = value;
    }

    // global variables
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    String query;
    Connections dbConnections = new Connections();
    DateTimeFormatter DATETIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public static Params listParams() {
        return new Params();
    }

    public static final class Params {

        private String username;
        private String periode;

        private Params() {
        }

        public Params withUsername(String val) {
            username = val;
            return this;
        }

        public Params withPeriode(String val) {
            periode = val;
            return this;
        }

        public List<Payslip> build() throws SQLException {
            Payslip payslip = new Payslip();
            return payslip.list(this);
        }
    }

    public List<Payslip> list(Params params) throws SQLException {
        List<Payslip> result = new ArrayList<>();

        dbConnections.configuration();
        connection = dbConnections.connection;
        statement = dbConnections.statement;

        query = "SELECT \n"
                + "p.*,\n"
                + "concat(e.first_name, ' ', e.last_name) as full_name\n"
                + "FROM \n"
                + "`e-cms`.payslip as p\n"
                + "inner join `e-cms`.employee as e on e.nik = p.username\n"
                + "WHERE\n"
                + "('" + params.username + "' = '' or concat(e.first_name, ' ', e.last_name) LIKE '%" + params.username + "%')\n"
                + "ORDER BY p.periode DESC;";

        if (params.periode != null) {
            query = "SELECT \n"
                    + "a.*,\n"
                    + "concat(e.first_name, ' ', e.last_name) as full_name\n"
                    + "FROM \n"
                    + "`e-cms`.attendance as a\n"
                    + "inner join `e-cms`.employee as e on e.nik = a.username\n"
                    + "WHERE\n"
                    + "('" + params.username + "' = '' or concat(e.first_name, ' ', e.last_name) LIKE '%" + params.username + "%')"
                    + "and p.periode = " + params.periode + "\n"
                    + "ORDER BY a.checkin DESC;";
        }

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Payslip payslip = new Payslip();

            payslip.setId(Integer.parseInt(resultSet.getString("id")));
            payslip.setUsername(resultSet.getString("username"));
            payslip.setPeriode(resultSet.getString("periode"));
            payslip.setWorkingHour(Float.parseFloat(resultSet.getString("working_hour")));
            payslip.setOvertimeHour(Float.parseFloat(resultSet.getString("overtime_hour")));
            payslip.setBasicSalary(Float.parseFloat(resultSet.getString("basic_salary")));
            payslip.setOvertimeSalary(Float.parseFloat(resultSet.getString("overtime_salary")));
            payslip.setBasicCuts(Float.parseFloat(resultSet.getString("basic_cuts")));
            payslip.setTaxCuts(Float.parseFloat(resultSet.getString("tax_cuts")));
            payslip.setNetSalary(Float.parseFloat(resultSet.getString("net_salary")));
            payslip.setFullName(resultSet.getString("full_name"));

            result.add(payslip);
        }

        return result;
    }
    
    public Boolean create(Payslip params) throws SQLException{
        // local variables
        boolean result = false;
        int affected;
        dbConnections.configuration();
        connection = dbConnections.connection;
        statement = dbConnections.statement;
        
        query = "INSERT INTO `e-cms`.`payslip`\n"
                + "(`username`,\n"
                + "`periode`,\n"
                + "`working_hour`,\n"
                + "`overtime_hour`,\n"
                + "`basic_salary`,\n"
                + "`overtime_salary`,\n"
                + "`basic_cuts`,\n"
                + "`tax_cuts`,\n"
                + "`net_salary`)\n"
                + "VALUES\n"
                + "('" + params.getUsername() + "',\n"
                + "'" + params.getPeriode() + "',\n"
                + "" + params.getWorkingHour() + ",\n"
                + "" + params.getOvertimeHour() + ",\n"
                + "" + params.getBasicSalary() + ",\n"
                + "" + params.getOvertimeSalary() + ",\n"
                + "" + params.getBasicCuts() + ",\n"
                + "" + params.getTaxCuts() + ",\n"
                + "" + params.getNetSalary()+");";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        affected = preparedStatement.executeUpdate();
        connection.close();
        
        if(affected > 0)
            result = true;
        return result;
    }
}
