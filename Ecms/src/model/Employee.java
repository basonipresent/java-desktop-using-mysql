/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import config.Connections;
import config.Constanta;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author bason
 */
public class Employee {
    // properties
    private Integer id;
    private Integer id_position;
    private String nik;
    private String first_name;
    private String last_name;
    private String address;
    private String city;
    private String phone;
    private String education_degree;
    private String status;
    private Float basic_salary;
    private Integer days_off;
    private String created_by;
    private String created_date;
    private String updated_by;
    private String updated_date;
    private String position_name;
    
    public Integer getId(){
        return id;
    }
    public void setId(Integer value){
        this.id = value;
    }
    
    public Integer getIdPosition(){
        return id_position;
    }
    public void setIdPosition(Integer value){
        this.id_position = value;
    }
    
    public String getNik(){
        return nik;
    }
    public void setNik(String value){
        this.nik = value;
    }
    
    public String getFirstName(){
        return first_name;
    }
    public void setFirstName(String value){
        this.first_name = value;
    }
    
    public String getLastName(){
        return last_name;
    }
    public void setLastName(String value){
        this.last_name = value;
    }
    
    public String getAddress(){
        return address;
    }
    public void setAddress(String value){
        this.address = value;
    }
    
    public String getCity(){
        return city;
    }
    public void setCity(String value){
        this.city = value;
    }
    
    public String getPhone(){
        return phone;
    }
    public void setPhone(String value){
        this.phone = value;
    }
    
    public String getEducationDegree(){
        return education_degree;
    }
    public void setEducationDegree(String value){
        this.education_degree = value;
    }
    
    public String getStatus(){
        return status;
    }
    public void setStatus(String value){
        this.status = value;
    }
    
    public Float getBasicSalary(){
        return basic_salary;
    }
    public void setBasicSalary(Float value){
        this.basic_salary = value;
    }
    
    public Integer getDaysOff(){
        return days_off;
    }
    public void setDaysOff(Integer value){
        this.days_off = value;
    }
    
    public String getCreatedBy(){
        return created_by;
    }
    public void setCreatedBy(String value){
        this.created_by = value;
    }
    
    public String getCreatedDate(){
        return created_date;
    }
    public void setCreatedDate(String value){
        this.created_date = value;
    }

    public String getUpdatedBy(){
        return updated_by;
    }
    public void setUpdatedBy(String value){
        this.updated_by = value;
    }
    
    public String getUpdatedDate(){
        return updated_date;
    }
    public void setUpdatedDate(String value){
        this.updated_date = value;
    }
    
    public String getPositionName(){
        return position_name;
    }
    public void setPositionName(String value){
        this.position_name = value;
    }
    
    // global variables
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    String query;
    Connections dbConnections = new Connections();
    DateTimeFormatter DATETIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    
    public List<Employee> list() throws SQLException {
        List<Employee> result = new ArrayList<>();
        
        dbConnections.configuration();
        connection = dbConnections.connection;
        statement = dbConnections.statement;
        
        query = "SELECT \n"
                + "e.*,\n"
                + "concat(p.`level`, ' ', p.`position_name`) as position_name\n"
                + "FROM \n"
                + "`e-cms`.employee as e \n"
                + "INNER JOIN `e-cms`.position as p on p.`id` = e.`id_position`\n"
                + "ORDER BY \n"
                + "e.`first_name`,\n"
                + "e.`last_name`;";
        
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Employee employee = new Employee();
            
            employee.setId(Integer.parseInt(resultSet.getString("id")));
            employee.setIdPosition(Integer.parseInt(resultSet.getString("id_position")));
            employee.setNik(resultSet.getString("nik"));
            employee.setFirstName(resultSet.getString("first_name"));
            employee.setLastName(resultSet.getString("last_name"));
            employee.setAddress(resultSet.getString("address"));
            employee.setCity(resultSet.getString("city"));
            employee.setPhone(resultSet.getString("phone"));
            employee.setEducationDegree(resultSet.getString("education_degree"));
            employee.setStatus(resultSet.getString("status"));
            employee.setBasicSalary(Float.parseFloat(resultSet.getString("basic_salary")));
            employee.setDaysOff(Integer.parseInt(resultSet.getString("days_off")));
            employee.setCreatedBy(resultSet.getString("created_by"));
            employee.setCreatedDate(resultSet.getString("created_date"));
            employee.setUpdatedBy(resultSet.getString("updated_by"));
            employee.setUpdatedDate(resultSet.getString("updated_date"));
            employee.setPositionName(resultSet.getString("position_name"));
            
            result.add(employee);
        }
        
        return result;
    }
    
    public Employee get(int id) throws SQLException {
        Employee result = new Employee();
        
        dbConnections.configuration();
        connection = dbConnections.connection;
        statement = dbConnections.statement;
        
        query = "SELECT \n"
                + "e.*,\n"
                + "concat(p.`level`, ' ', p.`position_name`) as position_name\n"
                + "FROM \n"
                + "`e-cms`.employee as e \n"
                + "INNER JOIN `e-cms`.position as p on p.`id` = e.`id_position`\n"
                + "WHERE e.`id` = "+ id +"\n"
                + "ORDER BY \n"
                + "e.`first_name`,\n"
                + "e.`last_name`;";
        
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            result.setId(Integer.parseInt(resultSet.getString("id")));
            result.setIdPosition(Integer.parseInt(resultSet.getString("id_position")));
            result.setNik(resultSet.getString("nik"));
            result.setFirstName(resultSet.getString("first_name"));
            result.setLastName(resultSet.getString("last_name"));
            result.setAddress(resultSet.getString("address"));
            result.setCity(resultSet.getString("city"));
            result.setPhone(resultSet.getString("phone"));
            result.setEducationDegree(resultSet.getString("education_degree"));
            result.setStatus(resultSet.getString("status"));
            result.setBasicSalary(Float.parseFloat(resultSet.getString("basic_salary")));
            result.setDaysOff(Integer.parseInt(resultSet.getString("days_off")));
            result.setCreatedBy(resultSet.getString("created_by"));
            result.setCreatedDate(resultSet.getString("created_date"));
            result.setUpdatedBy(resultSet.getString("updated_by"));
            result.setUpdatedDate(resultSet.getString("updated_date"));
            result.setPositionName(resultSet.getString("position_name"));
        }
        
        return result;
    }
    
    public Employee getByNik(String nik) throws SQLException {
        Employee result = new Employee();
        
        dbConnections.configuration();
        connection = dbConnections.connection;
        statement = dbConnections.statement;
        
        query = "SELECT \n"
                + "e.*,\n"
                + "concat(p.`level`, ' ', p.`position_name`) as position_name\n"
                + "FROM \n"
                + "`e-cms`.employee as e \n"
                + "INNER JOIN `e-cms`.position as p on p.`id` = e.`id_position`\n"
                + "WHERE e.`nik` = '" + nik + "'\n"
                + "AND e.`status` = '" + Constanta.Status.ACTIVE + "'\n"
                + "ORDER BY \n"
                + "e.`first_name`,\n"
                + "e.`last_name`;";
        
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            result.setId(Integer.parseInt(resultSet.getString("id")));
            result.setIdPosition(Integer.parseInt(resultSet.getString("id_position")));
            result.setNik(resultSet.getString("nik"));
            result.setFirstName(resultSet.getString("first_name"));
            result.setLastName(resultSet.getString("last_name"));
            result.setAddress(resultSet.getString("address"));
            result.setCity(resultSet.getString("city"));
            result.setPhone(resultSet.getString("phone"));
            result.setEducationDegree(resultSet.getString("education_degree"));
            result.setStatus(resultSet.getString("status"));
            result.setBasicSalary(Float.parseFloat(resultSet.getString("basic_salary")));
            result.setDaysOff(Integer.parseInt(resultSet.getString("days_off")));
            result.setCreatedBy(resultSet.getString("created_by"));
            result.setCreatedDate(resultSet.getString("created_date"));
            result.setUpdatedBy(resultSet.getString("updated_by"));
            result.setUpdatedDate(resultSet.getString("updated_date"));
            result.setPositionName(resultSet.getString("position_name"));
        }
        
        return result;
    }
    
    public Boolean create(Employee params) throws SQLException{
        // local variables
        boolean result = false;
        int affected;
        dbConnections.configuration();
        connection = dbConnections.connection;
        statement = dbConnections.statement;
        
        query = "INSERT INTO `e-cms`.`employee`\n"
                + "(`id_position`,\n"
                + "`nik`,\n"
                + "`first_name`,\n"
                + "`last_name`,\n"
                + "`address`,\n"
                + "`city`,\n"
                + "`phone`,\n"
                + "`education_degree`,\n"
                + "`status`,\n"
                + "`basic_salary`,\n"
                + "`days_off`,\n"
                + "`created_by`,\n"
                + "`created_date`,\n"
                + "`updated_by`,\n"
                + "`updated_date`)\n"
                + "VALUES\n"
                + "(" + params.getIdPosition() + ",\n"
                + "'" + params.getNik() + "',\n"
                + "'" + params.getFirstName() + "',\n"
                + "'" + params.getLastName() + "',\n"
                + "'" + params.getAddress() + "',\n"
                + "'" + params.getCity() + "',\n"
                + "'" + params.getPhone()+ "',\n"
                + "'" + params.getEducationDegree() + "',\n"
                + "'" + params.getStatus() + "',\n"
                + "" + params.getBasicSalary() + ",\n"
                + "" + params.getDaysOff() + ",\n"
                + "'" + params.getCreatedBy() + "',\n"
                + "'" + params.getCreatedDate() + "',\n"
                + "'" + params.getUpdatedBy() + "',\n"
                + "'" + params.getUpdatedDate() + "');";
        
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        affected = preparedStatement.executeUpdate();
        connection.close();
        
        if(affected > 0)
            result = true;
        return result;
    }
    
    public Boolean update(Employee params) throws SQLException{
        // local variables
        boolean result = false;
        int affected;
        dbConnections.configuration();
        connection = dbConnections.connection;
        statement = dbConnections.statement;
        
        query = "UPDATE `e-cms`.`employee`\n"
                + "SET\n"
                + "`id_position` = " + params.getIdPosition() + ",\n"
                + "`nik` = '" + params.getNik() + "',\n"
                + "`first_name` = '" + params.getFirstName() + "',\n"
                + "`last_name` = '" + params.getLastName() + "',\n"
                + "`address` = '" + params.getAddress() + "',\n"
                + "`city` = '" + params.getCity() + "',\n"
                + "`phone` = '" + params.getPhone()+ "',\n"
                + "`education_degree` = '" + params.getEducationDegree() + "',\n"
                + "`status` = '" + params.getStatus() + "',\n"
                + "`basic_salary` = " + params.getBasicSalary() + ",\n"
                + "`days_off` = " + params.getDaysOff() + ",\n"
                + "`updated_by` = '" + params.getUpdatedBy() + "',\n"
                + "`updated_date` = '" + params.getUpdatedDate() + "'\n"
                + "WHERE `id` = " + params.getId() + ";";
        
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        affected = preparedStatement.executeUpdate();
        connection.close();
        
        if(affected > 0)
            result = true;
        return result;
    }
    
    public Boolean delete(int id) throws SQLException{
        // local variables
        boolean result = false;
        int affected;
        dbConnections.configuration();
        connection = dbConnections.connection;
        statement = dbConnections.statement;
        
        query = "DELETE FROM `e-cms`.`employee`\n"
                + "WHERE `id` = " + id + ";";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        affected = preparedStatement.executeUpdate();
        connection.close();
        
        if(affected > 0)
            result = true;
        return result;
    }
}
