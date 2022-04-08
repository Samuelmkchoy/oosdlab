package Sys;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class addItem extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField price;
	private JTextField id;
	private JButton btnNewButton;

	public addItem() {

		setBounds(450, 190, 1014, 597);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewUserRegister = new JLabel("Add New Item");
		lblNewUserRegister.setFont(new Font("Tahoma", Font.PLAIN, 42));
		lblNewUserRegister.setBounds(362, 52, 325, 50);
		contentPane.add(lblNewUserRegister);

		JLabel lblNewId = new JLabel("ID");
		lblNewId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewId.setBounds(60, 155, 110, 29);
		contentPane.add(lblNewId);

		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblName.setBounds(60, 235, 110, 29);
		contentPane.add(lblName);

		JLabel lblNewLabel = new JLabel("Price");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(60, 320, 110, 29);
		contentPane.add(lblNewLabel);

		id = new JTextField();
		id.setFont(new Font("Tahoma", Font.PLAIN, 32));
		id.setBounds(150, 155, 228, 50);
		contentPane.add(id);
		id.setColumns(10);

		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 32));
		name.setBounds(150, 235, 228, 50);
		contentPane.add(name);
		name.setColumns(10);

		price = new JTextField();
		price.setFont(new Font("Tahoma", Font.PLAIN, 32));
		price.setBounds(150, 320, 228, 50);
		contentPane.add(price);
		price.setColumns(10);

		btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name1 = name.getText();
				String price1 = price.getText();
				String id1 = id.getText();

				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root",
							"aa992288");

					String query = "INSERT INTO item values('" + name1 + "','" + price1 + "','" + id1 + "')";

					Statement sta = connection.createStatement();
					int x = sta.executeUpdate(query);
					if (x == 0) {
						JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
					} else {
						JOptionPane.showMessageDialog(btnNewButton,
								"Welcome, " + name1 + "Item is sucessfully created");
					}
					connection.close();
				} catch (Exception exception) {
					exception.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(399, 447, 259, 74);
		contentPane.add(btnNewButton);
	}
}
