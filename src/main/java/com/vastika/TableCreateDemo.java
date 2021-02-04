package com.vastika;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreateDemo {
    public static final String Driver="com.mysql.cj.jdbc.Driver";
    public static final String URL="jdbc:mysql://localhost:3306/batchno_10 ";
    public static final String USER_NAME="root";
    public static final String PASSWORD="root";
    public static final String SQL="create table user_tbl(id int not null auto_increment, user_name varchar (100), password varchar(100), primary key(id))";

    public static void main(String[] args) {

        try(
                Connection con =DriverManager.getConnection(URL,USER_NAME,PASSWORD);
                Statement st =con.createStatement();
                ) {


            st.executeUpdate(SQL);
            System.out.println("Table created");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
