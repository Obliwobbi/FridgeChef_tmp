package io.github.mortenjenne.fridgechef.util;

import java.sql.*;

public class DatabaseReader extends DatabaseConnector{
    private DatabaseConnector db = new DatabaseConnector();

    public boolean accountLogin (String email, String password){
        db.connect();

        String sql = "SELECT password FROM accounts WHERE email = '"+email+"' ";

        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            String tmpPassword = rs.getString("password");
            if (password == tmpPassword){
                System.out.println("Account login success - OK");
                return true;
            } else {
                System.out.println("Email or password is incorrect");
                return false;
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean checkExistingAccount (String email){
        db.connect();
        String sql = "SELECT email FROM accounts WHERE email = '"+email+ "'";

        try{
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.getString("email") != email){
                return true;
            }
        } catch (SQLException e){
            System.out.println(e);
        }
        return false;
    }

}
