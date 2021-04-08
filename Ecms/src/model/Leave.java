/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import config.Connections;
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
 * @author bason
 */
public class Leave {
    private Integer id;
    private Integer id_attachment;
    private String username;
    private String request_date;
    private String date_from;
    private String date_to;
    private String reasons;
    private String status;
    private String full_name;
    private List<Attachment> list_attachment;
    
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
    
    public String getRequestDate(){
        return request_date;
    }
    public void setRequestDate(String value){
        this.request_date = value;
    }
    
    public String getDateFrom(){
        return date_from;
    }
    public void setDateFrom(String value){
        this.date_from = value;
    }
    
    public String getDateTo(){
        return date_to;
    }
    public void setDateTo(String value){
        this.date_to = value;
    }
    
    public String getReasons(){
        return reasons;
    }
    public void setReasons(String value){
        this.reasons = value;
    }
    
    public String getStatus(){
        return status;
    }
    public void setStatus(String value){
        this.status = value;
    }
    
    public String getFullName() {
        return full_name;
    }
    public void setFullName(String value) {
        this.full_name = value;
    }
    
    public List<Attachment> getListAttachment() {
        return list_attachment;
    }
    public void setListAttachment(List<Attachment> value) {
        this.list_attachment = value;
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

        public List<Leave> build() throws SQLException {
            Leave leave = new Leave();
            return leave.list(this);
        }
    }

    public List<Leave> list(Params params) throws SQLException {
        List<Leave> result = new ArrayList<>();
        
        dbConnections.configuration();
        connection = dbConnections.connection;
        statement = dbConnections.statement;

        query = "SELECT \n"
                + "l.*,\n"
                + "a.*,\n"
                + "concat(e.first_name, ' ', e.last_name) as full_name\n"
                + "FROM \n"
                + "`e-cms`.leave as l\n"
                + "inner join `e-cms`.attachment as a on a.id_leave = l.id\n"
                + "inner join `e-cms`.employee as e on e.nik = l.username\n"
                + "WHERE\n"
                + "('" + params.username + "' = '' or l.username = '" + params.username + "')\n"
                + "and (l.request_date >= '" + params.date_from + "' and l.request_date <= '" + params.date_to + "');";

        if(params.date_from == null
                && params.date_to == null){
            query = "SELECT \n"
                    + "l.*,\n"
                    + "concat(e.first_name, ' ', e.last_name) as full_name\n"
                    + "FROM \n"
                    + "`e-cms`.leave as l\n"
                    + "inner join `e-cms`.employee as e on e.nik = l.username\n"
                    + "WHERE\n"
                    + "('" + params.username + "' = '' or l.username = '" + params.username + "');";
        }
        
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Leave leave = new Leave();
            Attachment attachment = new Attachment();
            
            leave.setId(Integer.parseInt(resultSet.getString("id")));
            leave.setUsername(resultSet.getString("username"));
            leave.setRequestDate(resultSet.getString("request_date"));
            leave.setDateFrom(resultSet.getString("date_from"));
            leave.setDateTo(resultSet.getString("date_to"));
            leave.setReasons(resultSet.getString("reasons"));
            leave.setStatus(resultSet.getString("status"));
            leave.setFullName(resultSet.getString("full_name"));
            
            leave.setListAttachment(attachment.getByIdLeave(getId()));
            
            result.add(leave);
        }
        
        return result;
    }
}
