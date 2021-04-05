/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import config.Connections;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

/**
 *
 * @author bason
 */
public class Nationality {
    private Integer id;
    private String nationality;
    
    public Integer getId(){
        return id;
    }
    public void setId(Integer value){
        this.id = value;
    }
    
    public String getNationality(){
        return nationality;
    }
    public void setNationality(String value){
        this.nationality = value;
    }
    
    public void setNationality(Integer key, String value){
        this.id = key;
        this.nationality = value;
    }
    
    // global variables
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    String query;
    Connections dbConnections = new Connections();
    
    public HashMap<String, Integer> populateComboBox() throws SQLException{
        // local variables
        dbConnections.configuration();
        connection = dbConnections.connection;
        statement = dbConnections.statement;
        
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        
        query = "SELECT `id`, `nationality` FROM `e-cms`.nationality ORDER BY `nationality`;";
        resultSet = statement.executeQuery(query);
        
        while (resultSet.next()) {
            setNationality(resultSet.getInt("id"), 
                    resultSet.getString("nationality"));
            result.put(getNationality(), getId());
        }
        
        return result;
    }
}
