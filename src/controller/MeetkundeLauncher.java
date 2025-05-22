package controller;

import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

/**
 * @author Vincent Velthuizen
 * Speel met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        System.err.print("Driver laden ...");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.err.println(" driver geladen.");

            String database = "Figuren";

            String connectionUrl = "jdbc:mysql://localhost:3306/" + database;

            Properties properties = new Properties();
            properties.setProperty("user", "userFiguren");
            properties.setProperty("password", "userFigurenPW");

            Connection connection = DriverManager.getConnection(connectionUrl, properties);
            System.err.println("OK, Connection open");

        } catch (ClassNotFoundException classNotFoundException) {
            System.err.println(" laden van de MySQL driver is niet gelukt.");
        } catch (SQLException sqlException) {
            System.err.println("SQL Exception: " + sqlException.getMessage());
        }

    }

    public static void toonFiguur(Figuur figuur) {
        System.out.println(figuur);
        System.out.println(figuur.vertelOverGrootte());
    }

}
