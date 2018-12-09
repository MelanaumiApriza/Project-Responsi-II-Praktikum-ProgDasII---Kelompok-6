package Program;

import java.sql.*;
import javax.swing.*;

public class Koneksi {

    private Connection koneksi;

    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connection Success");
        } catch (ClassNotFoundException ex) {
            System.out.println("Connection Error" + ex);
        }
        String url = "jdbc:mysql://localhost/DBStreetFood";
        try {
            koneksi = (Connection) DriverManager.getConnection(url, "root", "");
        } catch (SQLException ex) {
            System.out.println("Error To Conect Database" + ex);
        }
        return koneksi;
    }
}