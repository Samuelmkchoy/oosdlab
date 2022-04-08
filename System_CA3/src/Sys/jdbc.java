package Sys;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class jdbc {
	public static final String URL = "jdbc:mysql://localhost:3306/db1";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "aa992288";

	public static void main(String[] args) {

		try {
			Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			JOptionPane.showMessageDialog(null, "Connection Successful");
			connection.close();
		} catch (Exception e) {
			System.err.print("Database Connection Error: " + e.getMessage());
		}

	}
}