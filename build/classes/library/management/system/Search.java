package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class Search extends JFrame implements ActionListener{
        public static String a = null;
        
	private JPanel contentPane;
	private JTextField t1;
        JComboBox comboBox;
        private JButton b1,b2;


	public Search() {
            
	setBounds(600, 150, 440, 442);
        setBackground(new Color(248, 240, 227));
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
        
        JLabel l1 = new JLabel("Enter Book Name/Author/Publisher:");
	l1.setForeground(new Color(47, 79, 79));
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setBounds(78, 84, 400, 22);
	contentPane.add(l1);
        
        t1 = new JTextField();
	t1.setForeground(new Color(47, 79, 79));
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t1.setBounds(110, 174, 198, 20);
	contentPane.add(t1);
	t1.setColumns(10);

	
	b1 = new JButton("Search");
	b1.addActionListener(this);
	b1.setBorder(new CompoundBorder(new LineBorder(new Color(128, 128, 128)), null));
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b1.setBounds(95, 300, 100, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	contentPane.add(b1);

	b2 = new JButton("Back");
	b2.addActionListener(this);
	b2.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b2.setBounds(212, 300, 108, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	contentPane.add(b2);

        contentPane.setBackground(new Color(248, 240, 227));
        }
        
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == b1){
                Search.a = t1.getText();
                this.setVisible(false);
		new Result().setVisible(true);
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
		new Home1().setVisible(true);
            }
        }
        
  	public static void main(String[] args) {
                new Search().setVisible(true);
	}

}
