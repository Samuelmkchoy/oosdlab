package jlab13;

import java.awt.GridBagLayout;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JPanel;

public class ColourSelect {
	{	
		JFrame f = new JFrame(); // create frame
		JPanel panel = new JPanel();

		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Red");
		comboBox.addItem("Yellow");
		comboBox.addItem("Blue");
		comboBox.addItem("Purple");
		comboBox.addItem("Pink");

		// create checkboxes
		JCheckBox checkBox1 = new JCheckBox("background");  
        checkBox1.setBounds(10, 20, 120, 30);  
        JCheckBox checkBox2 = new JCheckBox("foreground");  
        checkBox2.setBounds(10, 80, 120 ,30);
        
        JButton b1= new JButton("OK"); 		// creating instance of JButton  
        b1.setBounds(300, 10, 100, 40); 	// x axis, y axis, width, height  
        JButton b2= new JButton("Cancel"); 	// creating instance of JButton  
        b2.setBounds(300, 50, 100, 40); 	// x axis, y axis, width, height 
 
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1; 	//col
        gbc.gridy = 1;	//row
        panel.add(comboBox, gbc);
        
        gbc.gridx = 1;	//col
        gbc.gridy = 2;	//row
        panel.add(checkBox1, gbc);
        
        gbc.gridx = 2;	//col
        gbc.gridy = 2;	//row
        panel.add(checkBox2, gbc);
        
        gbc.gridx = 1;	//col
        gbc.gridy = 3;	//row
        panel.add(b1, gbc);
        
        gbc.gridx = 2;	//col
        gbc.gridy = 3;	//row
        panel.add(b2, gbc);
        
        f.add(panel);
        f.setTitle("Colour select");
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setSize(300,150);
		//f.pack();
		f.setVisible(true);
		f.setResizable(false); // prevent frame from being resized
        
		 class WindowCloser extends WindowAdapter 
			{
				public void windowClosing(WindowEvent e) 
					{
						System.exit(0);
					}
		}
        
	}
}
