package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LibraryManagementSystem extends JFrame implements ActionListener{

        JLabel l1;
        JButton b1, b2;
        
        public LibraryManagementSystem() {
		
                setSize(1366,390);
                setLayout(null);
                setLocation(300,300);

		l1 = new JLabel("");
                b1 = new JButton("Librarian");
                b2 = new JButton("Student/Faculty");
                
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);
                b1.setFont(new Font("Arial", Font.BOLD, 20));
		b1.setBorderPainted(false);
                
                b2.setBackground(Color.WHITE);
                b2.setForeground(Color.BLACK);
                b2.setFont(new Font("Arial", Font.BOLD, 20));
		b2.setBorderPainted(false);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/first.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1366, 390,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                
                b1.setBounds(850,300,150,60);
                b2.setBounds(1050,300,200,60);
		l1.setBounds(0, -50, 1366, 390);
                
                
                l1.add(b1);
                l1.add(b2);
		add(l1);
                
                b1.addActionListener(this);
                b2.addActionListener(this);
	}
        
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == b1){
                setVisible(false);
                Login_user lib = new Login_user();
                lib.setVisible(true);
            }   
            if(ae.getSource() == b2){
                setVisible(false);
                Login_user1 st = new Login_user1();
                st.setVisible(true);
            }
                
        }
        
        public static void main(String[] args) {
                LibraryManagementSystem window = new LibraryManagementSystem();
                window.setVisible(true);			
	}
}
