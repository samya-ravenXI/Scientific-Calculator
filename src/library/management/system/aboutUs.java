package library.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame implements ActionListener{

	private JPanel contentPane;
        private JButton b1;

        public static void main(String[] args) {
            new aboutUs().setVisible(true);			
	}
    
        public aboutUs() {
            
            super("About Us - Assistance Solutions");
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/logo.png"));
            Image i2 = i1.getImage().getScaledInstance(100, 80,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(500, 40, 100, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("Library");
            l3.setForeground(new Color(204, 51, 102));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(160, 40, 180, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(204, 51, 102));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

            JLabel l5 = new JLabel("v1.0");
            l5.setForeground(new Color(30, 144, 255));
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l5.setBounds(185, 140, 100, 21);
            contentPane.add(l5);


            JLabel l6 = new JLabel("Developed By : Assistance Solutions");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);
            
            JLabel l7 = new JLabel("ditipriyaseal@gmail.com (C5 - 185: Ditipriya Seal)");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 260, 600, 34);
            contentPane.add(l7);

            JLabel l8 = new JLabel("j.21.samyabose@gmail.com (C5 - 187: Samya Bose)");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(70, 290, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("junaidahmed50143@gmail.com (C5 - 195: Junaid Ahmed)");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(70, 320, 600, 34);
            contentPane.add(l9);

            JLabel l10 = new JLabel("namishagupta.c186@gmail.com (C5 - 186: Namisha Gupta)");
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.BOLD, 20));
            l10.setBounds(70, 350, 600, 34);
            contentPane.add(l10);
            
            b1 = new JButton("Back");
            b1.addActionListener(this);
            b1.setFont(new Font("Arial", Font.BOLD, 13));
            b1.setBounds(290, 400, 101, 29);
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.WHITE);
            contentPane.add(b1);
                
                
            contentPane.setBackground(new Color(248, 240, 227));
	}
    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            if(ae.getSource() == b1){
                this.setVisible(false);
		new Home().setVisible(true);
            }
        }catch(Exception e){
            
        }
    }

}

