package com.company;

import java.sql.*;

public class Main {
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:/Users/serhii/Documents/Web/Training/Java/complete-java-masterclass/TestDB/" + DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = conn.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS );

            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                                        " (" + COLUMN_NAME + " TEXT, " +
                                               COLUMN_PHONE +" INTEGER, " +
                                               COLUMN_EMAIL + " TEXT" +
                                        ")");

//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                                        " (" + COLUMN_NAME + ", " +
//                                               COLUMN_PHONE + ", " +
//                                               COLUMN_EMAIL +
//                                        " ) " +
//                                        "VALUES('Serhii', 1234567890, 'serhii@mail.com')");
//
//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                                        " (" + COLUMN_NAME + ", " +
//                                               COLUMN_PHONE + ", " +
//                                               COLUMN_EMAIL +
//                                        " ) " +
//                                        "VALUES('Joe', 45632, 'joe@anywhere.com')");
//
//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                                        " (" + COLUMN_NAME + ", " +
//                                               COLUMN_PHONE + ", " +
//                                               COLUMN_EMAIL +
//                                        " ) " +
//                                        "VALUES('Jane', 4829484, 'jane@somewhere.com')");
//
//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                                        " (" + COLUMN_NAME + ", " +
//                                               COLUMN_PHONE + ", " +
//                                               COLUMN_EMAIL +
//                                        " ) " +
//                                        "VALUES('Fido', 9038, 'dog@mail.com')");

            insertContact(statement,"Serhii", 1234567890, "serhii@mail.com");
            insertContact(statement,"Joe", 45632, "joe@anywhere.com");
            insertContact(statement,"Jane", 4829484, "jane@somewhere.com");
            insertContact(statement,"Fido", 9038, "dog@email.com");

            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
                                        COLUMN_PHONE + " = 5566789 " +
                                        " WHERE " + COLUMN_NAME + " = 'Jane'");

            statement.execute("DELETE FROM " + TABLE_CONTACTS +
                                        " WHERE " + COLUMN_NAME + " = 'Joe'");

            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while (results.next()) {
                System.out.println(results.getString(COLUMN_NAME) + " " +
                        results.getInt(COLUMN_PHONE) + " " +
                        results.getString(COLUMN_EMAIL));
            }
            results.close();

            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                                    " (" + COLUMN_NAME + ", " +
                                           COLUMN_PHONE + ", " +
                                           COLUMN_EMAIL +
                                    " ) " +
                                    "VALUES('" + name + "', " + phone + ", '" + email + "')");
    }

//    public static void main(String[] args) {
//        // /Users/serhii/Documents/Web/Training/Java/complete-java-masterclass/TestDB
//
////        try {
//////            Class.forName("org.sql.JDBC");
////            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/serhii/Documents/Web/Training/Java/complete-java-masterclass/TestDB/testjava.db");
////            Statement statement = conn.createStatement();
////            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
////
////        } catch (SQLException e) {
////            System.out.println("Something went wrong: " + e.getMessage());
////        }
//
////        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/serhii/Documents/Web/Training/Java/complete-java-masterclass/TestDB/testjava.db");
////            Statement statement = conn.createStatement()) {
////
////            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
////
////        } catch (SQLException e) {
////            System.out.println("Something went wrong: " + e.getMessage());
////        }
//
//        try {
//            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/serhii/Documents/Web/Training/Java/complete-java-masterclass/TestDB/testjava.db");
////            conn.setAutoCommit(false);
//
//            Statement statement = conn.createStatement();
//            statement.execute("CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER, email TEXT)");
//
////            statement.execute("INSERT INTO contacts (name, phone, email) VALUES ('Serhii', 1234567890, 'serhii@mail.com')");
//
////            statement.execute("INSERT INTO contacts (name, phone, email) VALUES ('Joe', 45632, 'joe@anywhere.com')");
////            statement.execute("INSERT INTO contacts (name, phone, email) VALUES ('Jane', 4829484, 'jane@somewhere.com')");
////            statement.execute("INSERT INTO contacts (name, phone, email) VALUES ('Fido', 9038, 'dog@mail.com')");
//
////            statement.execute("UPDATE contacts SET phone = 5566789 WHERE name = 'Jane'");
//
////            statement.execute("DELETE FROM contacts WHERE name = 'Joe'");
//
////            statement.execute("SELECT * FROM contacts");
////            ResultSet results = statement.getResultSet();
//            ResultSet results = statement.executeQuery("SELECT * FROM contacts");
//            while (results.next()) {
//                System.out.println(results.getString("name") + " " +
//                                   results.getInt("phone") + " " +
//                                   results.getString("email"));
//            }
//            results.close();
//
//            statement.close();
//            conn.close();
//
//        } catch (SQLException e) {
//            System.out.println("Something went wrong: " + e.getMessage());
//        }
//    }
}
