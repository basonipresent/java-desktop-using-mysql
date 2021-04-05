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
public class Position {
    private Integer id;
    private String position_name;
    
    public Integer getId(){
        return id;
    }
    public void setId(Integer value){
        this.id = value;
    }
    
    public String getPositionName(){
        return position_name;
    }
    public void setPositionName(String value){
        this.position_name = value;
    }
    
    public void setPosition(Integer key, String value){
        this.id = key;
        this.position_name = value;
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
        
        query = "SELECT `id`, concat(`level`, ' ', `position_name`) as position_name FROM `e-cms`.position ORDER BY `position_name`;";
        resultSet = statement.executeQuery(query);
        
        while (resultSet.next()) {
            setPosition(resultSet.getInt("id"), 
                    resultSet.getString("position_name").trim());
            result.put(getPositionName(), getId());
        }
        
        return result;
    }
}
