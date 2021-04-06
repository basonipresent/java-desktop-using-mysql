/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.sun.istack.internal.Nullable;
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
import java.util.Optional;

/**
 *
 * @author bason
 */
public class Attendance {
    // properties
    private Integer id;
    private String username;
    private String check_in;
    private String check_out;
    private String location;
    private Float duration;
    private String status;
    private String information;
    private String full_name;
    
    public Integer getId(){
        return id;
    }
    public void setId(Integer value){
        this.id = value;
    }
    
    public String getUsername() {
        return username;
    }
    public void setUsername(String value) {
        this.username = value;
    }
    
    public String getCheckIn(){
        return check_in;
    }
    public void setCheckIn(String value){
        this.check_in = value;
    }
    
    public String getCheckOut(){
        return check_out;
    }
    public void setCheckOut(String value){
        this.check_out = value;
    }
    
    public String getLocation(){
        return location;
    }
    public void setLocation(String value){
        this.location = value;
    }
    
    public Float getDuration(){
        return duration;
    }
    public void setDuration(Float value){
        this.duration = value;
    }
    
    public String getStatus(){
        return status;
    }
    public void setStatus(String value){
        this.status = value;
    }
    
    public String getInformation(){
        return information;
    }
    public void setInformation(String value){
        this.information = value;
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
    
    public static Params listParams(){
        return new Params();
    }
    
    public static final class Params {
        private String username;
        private String date_from;
        private String date_to;

        private Params() {
        }

        public Params withUsername(String val) {
            username = val;
            return this;
        }

        public Params withDateFrom(String val) {
            date_from = val;
            return this;
        }

        public Params withDateTo(String val) {
            date_to = val;
            return this;
        }

        public List<Attendance> build() throws SQLException {
            Attendance attendance = new Attendance();
            return attendance.list(this);
        }
    }

    public List<Attendance> list(Params params) throws SQLException {
        List<Attendance> result = new ArrayList<>();
        
        dbConnections.configuration();
        connection = dbConnections.connection;
        statement = dbConnections.statement;

        query = "SELECT \n"
                + "a.*,\n"
                + "concat(u.first_name, ' ', u.last_name) as full_name\n"
                + "FROM \n"
                + "`e-cms`.attendance as a\n"
                + "inner join `e-cms`.user as u on u.username = a.username\n"
                + "WHERE\n"
                + "('" + params.username + "' = '' or a.username = '" + params.username + "')\n"
                + "and (a.checkin >= '" + params.date_from + "' and a.checkin <= '" + params.date_to + "');";

        if(params.date_from == null
                && params.date_to == null){
            query = "SELECT \n"
                    + "a.*,\n"
                    + "concat(u.first_name, ' ', u.last_name) as full_name\n"
                    + "FROM \n"
                    + "`e-cms`.attendance as a\n"
                    + "inner join `e-cms`.user as u on u.username = a.username\n"
                    + "WHERE\n"
                    + "('" + params.username + "' = '' or a.username = '" + params.username + "');";
        }
        
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Attendance attendance = new Attendance();
            
            attendance.setId(Integer.parseInt(resultSet.getString("id")));
            attendance.setUsername(resultSet.getString("username"));
            attendance.setCheckIn(resultSet.getString("check_in"));
            attendance.setCheckOut(resultSet.getString("check_out"));
            attendance.setLocation(resultSet.getString("location"));
            attendance.setDuration(Float.parseFloat(resultSet.getString("duration")));
            attendance.setStatus(resultSet.getString("status"));
            attendance.setInformation(resultSet.getString("information"));
            attendance.setFullName(resultSet.getString("full_name"));
            
            result.add(attendance);
        }
        
        return result;
    }
    
    public Boolean checkIn(Attendance params) throws SQLException{
        // local variables
        boolean result = false;
        int affected;
        dbConnections.configuration();
        connection = dbConnections.connection;
        statement = dbConnections.statement;
        
        query = "INSERT INTO `e-cms`.`attendance`\n"
                + "(`username`,\n"
                + "`checkin`,\n"
                + "`location`,\n"
                + "`duration`,\n"
                + "`status`,\n"
                + "`information`)\n"
                + "VALUES\n"
                + "('" + params.getUsername() + "',\n"
                + "'" + params.getCheckIn() + "',\n"
                + "'" + params.getLocation() + "',\n"
                + "'" + Constanta.Default.DEFAULT_NUMERIC_VALUE + "',\n"
                + "'" + params.getStatus() + "',\n"
                + "'" + params.getInformation() + "');";
        
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        affected = preparedStatement.executeUpdate();
        connection.close();
        
        if(affected > 0)
            result = true;
        return result;
    }
    
    public Boolean checkOut(Attendance params) throws SQLException{
        // local variables
        boolean result = false;
        int affected;
        dbConnections.configuration();
        connection = dbConnections.connection;
        statement = dbConnections.statement;
        
        query = "UPDATE `e-cms`.`attendance`\n"
                + "SET\n"
                + "`checkout` = NOW(),\n"
                + "`duration` = ROUND(TIMESTAMPDIFF(MINUTE, checkin, NOW()) / 60.0, 2)\n"
                + "WHERE `id` = " + params.getId() + ";";
        
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        affected = preparedStatement.executeUpdate();
        connection.close();
        
        if(affected > 0)
            result = true;
        return result;
    }
}
