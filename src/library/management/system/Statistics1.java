package library.management.system;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;
import library.management.system.Login_user1;

public class Statistics1 extends JFrame{
    private JPanel contentPane;
    private JTable table;
    private JTable table_1;

    public static void main(String[] args) {
        new Statistics1().setVisible(true);
    }

    public void issueBook() {
	try {
            conn con =  new conn();
            String sql = "select * from issueBook where student_id=?";
            PreparedStatement st = con.c.prepareStatement(sql);
            st.setString(1,Login_user1.s);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));

	} catch (Exception e) {
			// TODO: handle exception
	}
    }

    public Statistics1() {
        setBounds(400, 200, 810, 470);
	contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(40, 51, 708, 217);
	contentPane.add(scrollPane);

        table = new JTable();
	table.setBackground(new Color(224, 255, 255));
	table.setForeground(new Color(128, 128, 0));
	table.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	scrollPane.setViewportView(table);

	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(47, 79, 79), 2, true), "Issue-Book-Details",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 128)));
	panel.setForeground(new Color(0, 128, 128));
	panel.setBounds(26, 36, 737, 240);
        panel.setBackground(Color.WHITE);
	contentPane.add(panel);

	JLabel l1 = new JLabel("Back");
	l1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
		setVisible(false);
		Home1 home = new Home1();
		home.setVisible(true);
            }
	});
	l1.setForeground(new Color(255, 0, 0));
	l1.setFont(new Font("Tahoma", Font.BOLD, 18));
	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/tenth.png"));
        Image i2 = i1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1.setIcon(i3);
	l1.setBounds(685, 13, 96, 27);
	contentPane.add(l1);
        
        JLabel l2 = new JLabel("Note: Books are to be returned within a month of borrowing. Fine will be incurred otherwise.");
        l2.setForeground(new Color(255, 0, 0));
	l2.setBounds(400, 380, 800, 24);
        l2.setFont(new Font("Tahoma", Font.BOLD, 8));
        contentPane.add(l2);
        
	issueBook();
    }
}
