package Sys;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class table {
	public table() {
		try {
			String url = "jdbc:mysql://localhost:3306/db1";
			String user = "root";
			String password = "aa992288";

			Connection con = DriverManager.getConnection(url, user, password);

			String query = "SELECT * FROM item";

			java.sql.Statement stm = con.createStatement();
			ResultSet res = stm.executeQuery(query);

			String columns[] = { "ID", "Name", "Price" };
			String data[][] = new String[8][3];

			int i = 0;
			while (res.next()) {
				String nom = res.getString("name");
				String age = res.getString("price");
				String id = res.getString("id");
				data[i][0] = id;
				data[i][1] = nom;
				data[i][2] = age;
				i++;
			}

			DefaultTableModel model = new DefaultTableModel(data, columns);
			JTable table = new JTable(model);

			table.setShowGrid(true);
			table.setShowVerticalLines(true);

			JScrollPane pane = new JScrollPane(table);
			JFrame f = new JFrame("Item from Database");
			JPanel panel = new JPanel();
			JButton btnNewButton = new JButton("Refresh");

			panel.add(pane);
			f.add(panel);
			f.setSize(600, 600);
			f.setVisible(true);
			f.setLayout(null);

			panel.add(btnNewButton);
			btnNewButton.setBounds(200, 400, 100, 25);
			btnNewButton.setFocusable(false);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						f.dispose();
						table f = new table();
						f.setVisible(true);
					} catch (Exception exception) {
						exception.printStackTrace();
					}
				}
			});
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub

	}
}