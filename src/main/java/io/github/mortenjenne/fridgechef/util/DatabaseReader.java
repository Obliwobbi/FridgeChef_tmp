package io.github.mortenjenne.fridgechef.util;

import java.sql.*;

public class DatabaseReader extends DatabaseConnector{

    public boolean accountLogin (String email, String password){
        connect();

        String sql = "SELECT password FROM accounts WHERE email = ?";

        try {
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1,email); //Prevents SQL Injections by setting placeholder value

            ResultSet rs = stm.executeQuery();
            if (rs.next()) { //This if checks for email existence
                String tmpPassword = rs.getString("password");

                if (password.equals(tmpPassword)) {
                    System.out.println("Account login success - OK");
                    return true;
                } else {
                    System.out.println("Email or password is incorrect");
                    return false;
                }


            } else {
                System.out.println("Email not found");
                return false;
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean checkExistingAccount (String email){
        connect();
        String sql = "SELECT email FROM accounts WHERE email = ?";

        try{
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1,email);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                return true; //Returns true if account exist
            }

        } catch (SQLException e){
            System.out.println("Error checking for accounts: "+e.getMessage());
        }
        return false; //Returns false if account does NOT exist
    }



}
