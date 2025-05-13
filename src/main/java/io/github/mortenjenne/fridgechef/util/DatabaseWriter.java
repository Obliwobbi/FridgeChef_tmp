package io.github.mortenjenne.fridgechef.util;

import java.sql.*;

public class DatabaseWriter extends DatabaseConnector{
    private DatabaseConnector db = new DatabaseConnector();
    private DatabaseReader dbReader = new DatabaseReader();


    public boolean createAccount (String email, String accountName, String password){
        db.connect();
        String sql = "INSERT INTO accounts (accountName, email, password) values ('"+accountName+"',"+email+","+password+")";

        if(dbReader.checkExistingAccount(email)){
            try {
                Statement stm = conn.createStatement();
                stm.executeQuery(sql);
                System.out.println("Account created - OK");
                return true;
            } catch (SQLException e) {
                System.out.println(e);
            }
        } else {
            System.out.println("Email is already in use, please try another");
            return false;
        }

        return false;
    }
}
