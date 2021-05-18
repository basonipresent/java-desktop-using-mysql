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
public class Leave {

    private Integer id;
    private Integer id_type;
    private Integer id_attachment;
    private String username;
    private String request_date;
    private String date_from;
    private String date_to;
    private String reasons;
    private String status;
    private String full_name;
    private String type_name;
    private List<Attachment> list_attachment;

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

    public String getRequestDate() {
        return request_date;
    }

    public void setRequestDate(String value) {
        this.request_date = value;
    }

    public String getDateFrom() {
        return date_from;
    }

    public void setDateFrom(String value) {
        this.date_from = value;
    }

    public String getDateTo() {
        return date_to;
    }

    public void setDateTo(String value) {
        this.date_to = value;
    }

    public String getReasons() {
        return reasons;
    }

    public void setReasons(String value) {
        this.reasons = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String value) {
        this.status = value;
    }

    public Integer getIdType() {
        return id_type;
    }

    public void setIdType(Integer value) {
        this.id_type = value;
    }

    public String getFullName() {
        return full_name;
    }

    public void setFullName(String value) {
        this.full_name = value;
    }

    public String getTypeName() {
        return type_name;
    }

    public void setTypeName(String value) {
        this.type_name = value;
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

    public static Params listParams() {
        return new Params();
    }

    public static final class Params {

        private String username;
        private String status;
        private String date_from;
        private String date_to;

        private Params() {
        }

        public Params withUsername(String val) {
            username = val;
            return this;
        }
        
        public Params withStatus(String val) {
            status = val;
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
        
        public List<Leave> buildApproval() throws SQLException {
            Leave leave = new Leave();
            return leave.listApproval(this);
        }
    }

    public List<Leave> list(Params params) throws SQLException {
        List<Leave> result = new ArrayList<>();

        dbConnections.configuration();
        connection = dbConnections.connection;
        statement = dbConnections.statement;

        query = "SELECT \n"
                + "l.*,\n"
                + "concat(e.first_name, ' ', e.last_name) as full_name,\n"
                + "lt.type as type_name\n"
                + "FROM \n"
                + "`e-cms`.leave as l\n"
                + "inner join `e-cms`.employee as e on e.nik = l.username\n"
                + "left join `e-cms`.leave_type as lt on lt.id = l.id_type\n"
                + "WHERE\n"
                + "('" + params.username + "' = '' or concat(e.first_name, ' ', e.last_name) LIKE '%" + params.username + "%')\n"
                + "and (l.request_date >= '" + params.date_from + "' and l.request_date <= '" + params.date_to + "')\n"
                + "ORDER BY\n"
                + "l.request_date DESC;";

        if(params.date_from == null
                && params.date_to == null){
            query = "SELECT \n"
                    + "l.*,\n"
                    + "concat(e.first_name, ' ', e.last_name) as full_name,\n"
                    + "lt.type as type_name\n"
                    + "FROM \n"
                    + "`e-cms`.leave as l\n"
                    + "inner join `e-cms`.employee as e on e.nik = l.username\n"
                    + "left join `e-cms`.leave_type as lt on lt.id = l.id_type\n"
                    + "WHERE\n"
                    + "('" + params.username + "' = '' or concat(e.first_name, ' ', e.last_name) LIKE '%" + params.username + "%')\n"
                    + "ORDER BY\n"
                    + "l.request_date DESC;";
        }

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Leave leave = new Leave();
            Attachment attachment = new Attachment();

            leave.setId(Integer.parseInt(resultSet.getString("id")));
            leave.setIdType(Integer.parseInt(resultSet.getString("id_type")));
            leave.setUsername(resultSet.getString("username"));
            leave.setRequestDate(resultSet.getString("request_date"));
            leave.setDateFrom(resultSet.getString("date_from"));
            leave.setDateTo(resultSet.getString("date_to"));
            leave.setReasons(resultSet.getString("reason"));
            leave.setStatus(resultSet.getString("status"));
            leave.setFullName(resultSet.getString("full_name"));
            leave.setTypeName(resultSet.getString("type_name"));

            leave.setListAttachment(attachment.getByHeader(leave.getId()));

            result.add(leave);
        }

        return result;
    }


    public List<Leave> listApproval(Params params) throws SQLException {
        List<Leave> result = new ArrayList<>();

        dbConnections.configuration();
        connection = dbConnections.connection;
        statement = dbConnections.statement;

        query = "SELECT \n"
                + "l.*,\n"
                + "concat(e.first_name, ' ', e.last_name) as full_name,\n"
                + "lt.type as type_name\n"
                + "FROM \n"
                + "`e-cms`.leave as l\n"
                + "inner join `e-cms`.employee as e on e.nik = l.username\n"
                + "left join `e-cms`.leave_type as lt on lt.id = l.id_type\n"
                + "WHERE\n"
                + "('" + params.username + "' = '' or concat(e.first_name, ' ', e.last_name) LIKE '%" + params.username + "%')\n"
                + "and (l.request_date >= '" + params.date_from + "' and l.request_date <= '" + params.date_to + "')\n"
                + "and l.status <> '" + Constanta.Leave.DRAF + "'\n"
                + (params.status.equals(Constanta.Leave.ALL) ? "\n" : "and l.status = '" + params.status + "'\n")
                + "ORDER BY\n"
                + "l.request_date DESC;";

        if((params.date_from == null
                && params.date_to == null)){
            query = "SELECT \n"
                    + "l.*,\n"
                    + "concat(e.first_name, ' ', e.last_name) as full_name,\n"
                    + "lt.type as type_name\n"
                    + "FROM \n"
                    + "`e-cms`.leave as l\n"
                    + "inner join `e-cms`.employee as e on e.nik = l.username\n"
                    + "left join `e-cms`.leave_type as lt on lt.id = l.id_type\n"
                    + "WHERE\n"
                    + "('" + params.username + "' = '' or concat(e.first_name, ' ', e.last_name) LIKE '%" + params.username + "%')\n"
                    + "and l.status <> '" + Constanta.Leave.DRAF + "'\n"
                    + (params.status.equals(Constanta.Leave.ALL) ? "\n" : "and l.status = '" + params.status + "'\n")
                    + "ORDER BY\n"
                    + "l.request_date DESC;";
        }

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Leave leave = new Leave();
            Attachment attachment = new Attachment();

            leave.setId(Integer.parseInt(resultSet.getString("id")));
            leave.setIdType(Integer.parseInt(resultSet.getString("id_type")));
            leave.setUsername(resultSet.getString("username"));
            leave.setRequestDate(resultSet.getString("request_date"));
            leave.setDateFrom(resultSet.getString("date_from"));
            leave.setDateTo(resultSet.getString("date_to"));
            leave.setReasons(resultSet.getString("reason"));
            leave.setStatus(resultSet.getString("status"));
            leave.setFullName(resultSet.getString("full_name"));
            leave.setTypeName(resultSet.getString("type_name"));

            leave.setListAttachment(attachment.getByHeader(leave.getId()));

            result.add(leave);
        }

        return result;
    }
    
    public Boolean create(Leave params) throws SQLException {
        // local variables
        boolean result = true;
        dbConnections.configuration();
        connection = dbConnections.connection;
        statement = dbConnections.statement;

        query = "INSERT INTO `e-cms`.`leave`\n"
                + "(`username`,\n"
                + "`request_date`,\n"
                + "`date_from`,\n"
                + "`date_to`,\n"
                + "`reason`,\n"
                + "`id_type`,\n"
                + "`status`)\n"
                + "VALUES\n"
                + "('" + params.getUsername() + "',\n"
                + "'" + params.getRequestDate() + "',\n"
                + "'" + params.getDateFrom() + "',\n"
                + "'" + params.getDateTo() + "',\n"
                + "'" + params.getReasons() + "',\n"
                + "" + params.getIdType() + ",\n"
                + "'" + params.getStatus() + "');";

        PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.executeUpdate();
        resultSet = preparedStatement.getGeneratedKeys();
        
        if (resultSet.next()) {
            int new_id = resultSet.getInt(1);
            for(Attachment attachmentParams : params.getListAttachment()){
                attachmentParams.setIdLeave(new_id);
                Attachment attachment = new Attachment();
                if(!attachment.create(attachmentParams)){
                    result = false;
                    break;
                }
            }
        } else{
            result = false;
        }
        connection.close();
        return result;
    }
    
    public Boolean update(Leave params) throws SQLException {
        // local variables
        boolean result = true;
        int affected;
        dbConnections.configuration();
        connection = dbConnections.connection;
        statement = dbConnections.statement;

        query = "UPDATE `e-cms`.`leave`\n"
                + "SET\n"
                + "`id_type` = " + params.getIdType() + ",\n"
                + "`date_from` = '" + params.getDateFrom() + "',\n"
                + "`date_to` = '" + params.getDateTo() + "',\n"
                + "`reason` = '" + params.getReasons() + "',\n"
                + "`status` = '" + params.getStatus() + "'\n"
                + "WHERE `id` = " + params.getId() + ";";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        affected = preparedStatement.executeUpdate();
        connection.close();
        
        if (affected > 0) {
            if(params.getListAttachment().size() > 0){
                // delete file before.
                Attachment attachment = new Attachment();
                attachment.deleteByHeader(params.getId());
                for (Attachment attachmentParams : params.getListAttachment()) {
                    attachmentParams.setIdLeave(params.getId());
                    if (!attachment.create(attachmentParams)) {
                        result = false;
                        break;
                    }
                }
            }
        } else{
            result = false;
        }
        return result;
    }
    
    public Leave get(int id) throws SQLException {
        Leave result = new Leave();

        dbConnections.configuration();
        connection = dbConnections.connection;
        statement = dbConnections.statement;

        query = "SELECT \n"
                + "l.*,\n"
                + "concat(e.first_name, ' ', e.last_name) as full_name,\n"
                + "lt.type as type_name\n"
                + "FROM \n"
                + "`e-cms`.leave as l\n"
                + "inner join `e-cms`.employee as e on e.nik = l.username\n"
                + "left join `e-cms`.leave_type as lt on lt.id = l.id_type\n"
                + "WHERE\n"
                + "l.id = " + id + "\n"
                + "ORDER BY\n"
                + "l.request_date DESC;";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Attachment attachment = new Attachment();

            result.setId(Integer.parseInt(resultSet.getString("id")));
            result.setIdType(Integer.parseInt(resultSet.getString("id_type")));
            result.setUsername(resultSet.getString("username"));
            result.setRequestDate(resultSet.getString("request_date"));
            result.setDateFrom(resultSet.getString("date_from"));
            result.setDateTo(resultSet.getString("date_to"));
            result.setReasons(resultSet.getString("reason"));
            result.setStatus(resultSet.getString("status"));
            result.setFullName(resultSet.getString("full_name"));
            result.setTypeName(resultSet.getString("type_name"));

            result.setListAttachment(attachment.getByHeader(result.getId()));
        }

        return result;
    }
    
    public Boolean delete(int id) throws SQLException{
        // local variables
        boolean result = false;
        int affected;
        dbConnections.configuration();
        connection = dbConnections.connection;
        statement = dbConnections.statement;
        
        query = "DELETE FROM `e-cms`.`leave`\n"
                + "WHERE `id` = " + id + ";";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        affected = preparedStatement.executeUpdate();
        connection.close();
        
        if(affected > 0){
            Attachment attachment = new Attachment();
            attachment.deleteByHeader(id);
            result = true;
        }
        
        return result;
    }
}
