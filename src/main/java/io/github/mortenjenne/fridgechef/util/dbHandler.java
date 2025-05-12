package io.github.mortenjenne.fridgechef.util;

import java.sql.*;

public class dbHandler {

    Connection conn;
    String path = "jdbc:sqlite:identifier.sqlite";
/*
    public boolean dbConnect(){

        try{
            conn = DriverManager.getConnection(path);
            System.out.println("Connected to DB - OK");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean accountLogin (String email, String password){
        String sql = "SELECT password FROM accounts WHERE email = '"+email+"' ";
        dbConnect();

        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            String tmpPassword = rs.getString("password");
            if (password.equals(tmpPassword)){
                System.out.println("Account login success - OK");
                return true;
            } else {
                System.out.println("Email or password is incorrect");
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean checkExistingAccount (String email){
        String sql = "SELECT email FROM accounts WHERE email = '"+email+ "'";
        dbConnect();

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

    public boolean createAccount (String email, String accountName, String password){
        String sql = "INSERT INTO accounts (accountName, email, password) values ('"+accountName+"',"+email+","+password+")";
        dbConnect();

        if(checkExistingAccount(email)){
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

 */
}
