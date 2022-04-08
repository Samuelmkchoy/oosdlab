package Sys;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class WelcomePage implements ActionListener {

	JFrame frame = new JFrame("Main Menu");
	JLabel welcomeLabel = new JLabel("Hello!");
	JLabel idLabel = new JLabel("ID!");
	JTextField idField = new JTextField();
	// JTable table = new JTable();
	// JScrollPane scrollPane = new JScrollPane();
	JButton addButton = new JButton("Add");
	JButton viewButton = new JButton("View");
	JButton updateButton = new JButton("Update");
	JButton deleteButton = new JButton("Delete");
	JButton logOutButton = new JButton("LogOut");
	JLabel messageLabel = new JLabel();

	WelcomePage(String userID) {
		idField.setBounds(150, 210, 100, 25);

		idLabel.setBounds(120, 210, 100, 25);
		idLabel.setFont(new Font(null, Font.PLAIN, 12));
		idLabel.setText("ID: ");

		welcomeLabel.setBounds(150, 10, 100, 25);
		welcomeLabel.setFont(new Font(null, Font.PLAIN, 12));
		welcomeLabel.setText("User: " + userID + "");

		addButton.setBounds(150, 50, 100, 25);
		addButton.setFocusable(false);
		addButton.addActionListener(this);

		viewButton.setBounds(150, 90, 100, 25);
		viewButton.setFocusable(false);
		viewButton.addActionListener(this);

		updateButton.setBounds(150, 130, 100, 25);
		updateButton.setFocusable(false);
		updateButton.addActionListener(this);

		deleteButton.setBounds(150, 170, 100, 25);
		deleteButton.setFocusable(false);
		deleteButton.addActionListener(this);

		logOutButton.setBounds(150, 250, 100, 25);
		logOutButton.setFocusable(false);
		logOutButton.addActionListener(this);

		// table.setBounds(300,40,200,200);
		// table.setSize(500, 300);
		// table.setVisible(true);

		// scrollPane.setBounds(300,40,400,400);

		// frame.add(scrollPane);
		frame.add(welcomeLabel);
		frame.add(idLabel);
		frame.add(addButton);
		frame.add(viewButton);
		frame.add(updateButton);
		frame.add(deleteButton);
		frame.add(logOutButton);
		// frame.add(table);
		frame.add(idField);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addButton) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						addItem frame = new addItem();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		if (e.getSource() == viewButton) {
			// frame.dispose();
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						table frame = new table();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		if (e.getSource() == updateButton) {
			// frame.dispose();
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						update frame = new update();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		if (e.getSource() == deleteButton) {
			String id1 = idField.getText();
			try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root",
					"aa992288"); Statement stmt = connection.createStatement();) {
				String sql = "DELETE FROM item " + "WHERE id = " + id1 + ";";
				stmt.executeUpdate(sql);
				ResultSet rs = stmt.executeQuery("SELECT name, price , id FROM item");

				JOptionPane.showMessageDialog(deleteButton, "ID: " + id1 + " is sucessfully deleted");

				rs.close();
			} catch (Exception exception) {
				exception.printStackTrace();
			}

		}

		if (e.getSource() == logOutButton) {
			frame.dispose();
			IDandPw idandPasswords = new IDandPw();
			LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
		}
	}
}
