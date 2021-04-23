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
import java.util.ArrayList;
import java.util.List;

/**
 *
 *  
 */
public class Users {

    // properties
    private Integer id;
    private Integer id_role;
    private String username;
    private String password;
    private String first_name;
    private String last_name;
    private Boolean is_active;
    private List<String> access_menu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer value) {
        this.id = value;
    }

    public Integer getIdRole() {
        return id_role;
    }

    public void setIdRole(Integer value) {
        this.id_role = value;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String value) {
        this.username = value;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        this.password = value;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String value) {
        this.first_name = value;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String value) {
        this.last_name = value;
    }

    public Boolean getIsActive() {
        return is_active;
    }

    public void setIsActive(Boolean value) {
        this.is_active = value;
    }

    public List<String> getAccessMenu() {
        return access_menu;
    }

    public void setAccessMenu(List<String> value) {
        this.access_menu = value;
    }

    // global variables
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    String query;
    Connections dbConnections = new Connections();

    public Boolean login(String username, String password) throws SQLException {
        // local variables
        dbConnections.configuration();
        connection = dbConnections.connection;
        statement = dbConnections.statement;

        // set result
        boolean result = false;
        List<String> menus = new ArrayList<>();
        query = "SELECT * FROM \n"
                + "`e-cms`.user as u\n"
                + "inner join `e-cms`.role as r on r.id = u.id_role\n"
                + "inner join `e-cms`.access_menu as am on am.id_role = r.id\n"
                + "WHERE u.username = '" + username + "' AND u.password = '" + password + "';";
        resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            setId(resultSet.getInt("id"));
            setIdRole(resultSet.getInt("id_role"));
            setUsername(resultSet.getString("username"));
            setPassword(resultSet.getString("password"));
            setFirstName(resultSet.getString("first_name"));
            setLastName(resultSet.getString("last_name"));
            setIsActive(resultSet.getBoolean("is_active"));
            menus.add(resultSet.getString("access_menu"));
        }
        setAccessMenu(menus);

        result = username.equals(getUsername())
                && password.equals(getPassword());

        connection.close();
        return result;
    }

    public boolean insertData(Users params) throws SQLException {
        // local variables
        dbConnections.configuration();
        connection = dbConnections.connection;
        statement = dbConnections.statement;
        boolean result = false;
        int affected;
        
        query = "INSERT INTO `e-cms`.`user`\n"
                + "(`id_role`,\n"
                + "`username`,\n"
                + "`password`,\n"
                + "`first_name`,\n"
                + "`last_name`,\n"
                + "`is_active`)\n"
                + "VALUES\n"
                + "(" + params.getIdRole() + ",\n"
                + "'" + params.getUsername()+ "',\n"
                + "'" + params.getPassword() + "',\n"
                + "'" + params.getFirstName() + "',\n"
                + "'" + params.getLastName() + "',\n"
                + "" + 1 + ");";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        affected = preparedStatement.executeUpdate();
        connection.close();

        if (affected > 0) {
            result = true;
        }
        return result;
    }
}
