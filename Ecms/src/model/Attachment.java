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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bason
 */
public class Attachment {
    private Integer id;
    private Integer id_leave;
    private String file_name;
    private String file_path;
    
    public Integer getId(){
        return id;
    }
    public void setId(Integer value){
        this.id = value;
    }
    
    public Integer getIdLeave(){
        return id_leave;
    }
    public void setIdLeave(Integer value){
        this.id_leave = value;
    }
    
    public String getFileName() {
        return file_name;
    }
    public void setFileName(String value) {
        this.file_name = value;
    }
    
    public String getFilePath() {
        return file_path;
    }
    public void setFilePath(String value) {
        this.file_path = value;
    }
    
    // global variables
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    String query;
    Connections dbConnections = new Connections();
    
    public List<Attachment> getByIdLeave(int id) throws SQLException{
        List<Attachment> result = new ArrayList();
        
        dbConnections.configuration();
        connection = dbConnections.connection;
        statement = dbConnections.statement;
        
        query = "SELECT * FROM `e-cms`.attachment where id_leave = " + id +";";
        
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Attachment attachment = new Attachment();
            
            attachment.setId(Integer.parseInt(resultSet.getString("id")));
            attachment.setId(Integer.parseInt(resultSet.getString("id_leave")));
            attachment.setFilePath(resultSet.getString("file_name"));
            attachment.setFilePath(resultSet.getString("file_path"));
            
            result.add(attachment);
        }
        
        return result;
    }
}
