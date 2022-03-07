package jlab14;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Printer {

	{	
		//Create frame
		JFrame f = new JFrame(); // create frame
		JPanel panel = new JPanel();
	
		f.setTitle("Printer");
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setSize(500,230);
		f.add(panel);
		panel.setLayout(null);
		
		//Add text area
		JTextArea a1 = new JTextArea();
		a1.setBounds(20, 30, 50, 115);
		panel.add(a1);
		
		//Add label
		JLabel l1 = new JLabel("Printer: MyPrinter");
		l1.setBounds(20, 5, 150, 20); //x,y,width,length
		panel.add(l1);
		
		//Checkbox
		JCheckBox checkBox1 = new JCheckBox("Image");  
	    checkBox1.setBounds(80, 30, 70, 30);  
	    JCheckBox checkBox2 = new JCheckBox("Text");  
	    checkBox2.setBounds(80, 70, 70 ,30);
	    JCheckBox checkBox3 = new JCheckBox("Code");
	    checkBox3.setBounds(80, 110, 70, 30);
	    panel.add(checkBox1);
	    panel.add(checkBox2);
	    panel.add(checkBox3);
	    
	    //Add second text area
	    JTextArea a2 = new JTextArea();
		a2.setBounds(150, 30, 50, 115);
		panel.add(a2);
	    
	    //Add radio buttons
	    JRadioButton rb1 = new JRadioButton("Selection");
	    rb1.setBounds(200, 30, 70, 30);
	    JRadioButton rb2 = new JRadioButton("All");
	    rb2.setBounds(200, 70, 70, 30);
	    JRadioButton rb3 = new JRadioButton("Applet");
	    rb3.setBounds(200, 110, 70, 30);
	    panel.add(rb1);
	    panel.add(rb2);
	    panel.add(rb3);
	    
	    //Add third text area
	    JTextArea a3 = new JTextArea();
	    a3.setBounds(280, 30, 50, 115);
	    panel.add(a3);
	    
	    //Add buttons
	    JButton b1 = new JButton("ok");
	    b1.setBounds(360, 5, 90, 40);
	    JButton b2 = new JButton("Cancel");
	    b2.setBounds(360,50, 90, 40);
	    JButton b3 = new JButton("Setup");
	    b3.setBounds(360, 95, 90, 40);
	    JButton b4 = new JButton("Help");
	    b4.setBounds(360, 140, 90, 40);
	    panel.add(b1);
	    panel.add(b2);
	    panel.add(b3);
	    panel.add(b4);
	    
		 //Add second label
		 JLabel l2 = new JLabel("Print Quality:");
		 l2.setBounds(60, 150, 110, 30); //x,y,width,length
		 panel.add(l2);
		 
		 //Add combobox
		 JComboBox cb1 = new JComboBox();
		 cb1.addItem("High");
		 cb1.addItem("Low");
		 cb1.addItem("Medium");
		 cb1.setBounds(150, 150, 80, 30);
		 panel.add(cb1);
		 
		 JCheckBox checkBox4 = new JCheckBox("Print to File");
		 checkBox4.setBounds(240, 140, 100, 50);
		 panel.add(checkBox4);
		 
	  	
		 f.setVisible(true);
	    
	    
	}
    
}
