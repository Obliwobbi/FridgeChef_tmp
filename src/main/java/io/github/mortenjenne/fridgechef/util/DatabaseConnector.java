package io.github.mortenjenne.fridgechef.util;

import java.sql.*;

public class DatabaseConnector {
    protected Connection conn;

    //Vi skal finde den rigtige path - kan ikke gøres under Code with me som guest
    private String path = "jdbc:sqlite:identifier.sqlite";


    public void connect(){

        try {
            conn = DriverManager.getConnection(path);
            System.out.println("Connected to DB - OK");
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
