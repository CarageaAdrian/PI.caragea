package com.example.proiect;
import java.sql.*;


public class DatabaseConnection {
    public Connection databaseLink;

    /***
     * Function to connect to the database
     * @return a connection to database
     */
    public Connection getConnection(){
        String databaseName = "proiect";
        String databaseUser = "root";
        String databasePassword = "admin";
        String url = "jdbc:mysql://localhost/" +databaseName;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink= DriverManager.getConnection(url,databaseUser,databasePassword);
        } catch (Exception e){

        }
        return databaseLink;
    }

}
