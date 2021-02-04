package com.vastika;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {
    public static final String Driver="com.mysql.cj.jdbc.Driver";
    public static final String URL="jdbc:mysql://localhost:3306/batchno_10 ";
    public static final String USER_NAME="root";
    public static final String PASSWORD="root";
    public static final String SQL="insert into user_tbl(user_name, password) values ('ram','aa')";

    public static void main(String[] args) {

        try(
                Connection con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
                Statement st =con.createStatement();
        ) {


            st.executeUpdate(SQL);
            System.out.println("Data Inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
