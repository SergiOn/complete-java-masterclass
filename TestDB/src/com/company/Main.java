package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // /Users/serhii/Documents/Web/Training/Java/complete-java-masterclass/TestDB

//        try {
////            Class.forName("org.sql.JDBC");
//            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/serhii/Documents/Web/Training/Java/complete-java-masterclass/TestDB/testjava.db");
//            Statement statement = conn.createStatement();
//            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
//
//        } catch (SQLException e) {
//            System.out.println("Something went wrong: " + e.getMessage());
//        }

//        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/serhii/Documents/Web/Training/Java/complete-java-masterclass/TestDB/testjava.db");
//            Statement statement = conn.createStatement()) {
//
//            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
//
//        } catch (SQLException e) {
//            System.out.println("Something went wrong: " + e.getMessage());
//        }

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/serhii/Documents/Web/Training/Java/complete-java-masterclass/TestDB/testjava.db");
//            conn.setAutoCommit(false);

            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER, email TEXT)");

//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES ('Serhii', 1234567890, 'serhii@mail.com')");

//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES ('Joe', 45632, 'joe@anywhere.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES ('Jane', 4829484, 'jane@somewhere.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES ('Fido', 9038, 'dog@mail.com')");

//            statement.execute("UPDATE contacts SET phone = 5566789 WHERE name = 'Jane'");

//            statement.execute("DELETE FROM contacts WHERE name = 'Joe'");

            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            while (results.next()) {
                System.out.println(results.getString("name") + " " +
                                   results.getInt("phone") + " " +
                                   results.getString("email"));
            }
            results.close();

            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
