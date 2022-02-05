package jlab12;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;


public class Lab12 {
	
	Lab12(){  
        JFrame f= new JFrame("Align"); 
        
        JCheckBox checkBox1 = new JCheckBox("Snap to Grid");  
        checkBox1.setBounds(10, 20, 120, 30);  
        JCheckBox checkBox2 = new JCheckBox("Show Grid");  
        checkBox2.setBounds(10, 80, 120 ,30);  
        
        JButton b1= new JButton("OK");//creating instance of JButton  
        b1.setBounds(300, 10, 100, 40);//x axis, y axis, width, height  
        JButton b2= new JButton("Cancel");//creating instance of JButton  
        b2.setBounds(300, 50, 100, 40);//x axis, y axis, width, height  
        JButton b3= new JButton("Help");//creating instance of JButton  
        b3.setBounds(300, 90, 100, 40);//x axis, y axis, width, height  
        
        JLabel l1=new JLabel("X:");    
        l1.setBounds(150, 20, 80, 30);
        JLabel l2=new JLabel("Y:");    
        l2.setBounds(150, 80, 80, 30); 
        
        JTextField text1 = new JTextField("8");  
        text1.setBounds(170, 20, 100, 30); 
        JTextField text2 = new JTextField("8");
        text2.setBounds(170, 80, 100, 30);
        
        
        f.add(checkBox1);  
        f.add(checkBox2); 
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(text1);
        f.add(text2);
        f.add(l1);
        f.add(l2);
        f.setSize(400,180);  
        f.setLayout(null);  
        f.setVisible(true); 
		f.addWindowListener(new WindowCloser());

     }  
	class WindowCloser extends WindowAdapter 
	{
		public void windowClosing(WindowEvent evt) 
		{
			System.exit(0);
		}
	}
}