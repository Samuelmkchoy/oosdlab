package Sys;

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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class update extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField price;
	private JTextField id;
	private JLabel info;
	private JButton btnNewButton;
	static final String QUERY = "SELECT name, price , id FROM item";

	public update() {

		setBounds(450, 190, 1014, 597);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewUserRegister = new JLabel("Update Item");
		lblNewUserRegister.setFont(new Font("Tahoma", Font.PLAIN, 42));
		lblNewUserRegister.setBounds(362, 52, 325, 50);
		contentPane.add(lblNewUserRegister);

		JLabel lblNewId = new JLabel("ID");
		lblNewId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewId.setBounds(60, 150, 150, 50);
		contentPane.add(lblNewId);

		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblName.setBounds(60, 230, 150, 50);
		contentPane.add(lblName);

		JLabel lblNewLabel = new JLabel("Price");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(60, 320, 150, 50);
		contentPane.add(lblNewLabel);

		info = new JLabel();
		info.setBounds(150, 120, 300, 25);
		info.setFont(new Font(null, Font.PLAIN, 12));
		contentPane.add(info);
		info.setText("*Input the correct ID to update detail!!!");

		id = new JTextField();
		id.setFont(new Font("Tahoma", Font.PLAIN, 32));
		id.setBounds(150, 150, 300, 50);
		contentPane.add(id);
		id.setColumns(10);

		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 32));
		name.setBounds(150, 230, 300, 50);
		contentPane.add(name);
		name.setColumns(10);

		price = new JTextField();
		price.setFont(new Font("Tahoma", Font.PLAIN, 32));
		price.setBounds(150, 320, 300, 50);
		contentPane.add(price);
		price.setColumns(10);

		btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id1 = id.getText();
				String name1 = name.getText();
				String price1 = price.getText();

				try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root",
						"aa992288"); Statement stmt = connection.createStatement();) {
					String sql = "UPDATE item " + "SET Name = '" + name1 + "', Price = '" + price1 + "' WHERE id = "
							+ id1 + ";";
					stmt.executeUpdate(sql);
					ResultSet rs = stmt.executeQuery(QUERY);
					JOptionPane.showMessageDialog(btnNewButton, "ID: " + id1 + " is sucessfully updated");
					rs.close();
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
