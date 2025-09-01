import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Read {
	
	Read() {
		
		JFrame frame = new JFrame();
		frame.setTitle("Search");
		frame.setSize(500,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		JLabel label1 = new JLabel();
		label1.setText("Search your info by id!");
		label1.setBounds(10, 20, 300, 30);
		Font font1 = new Font("Arial", Font.PLAIN, 20);
		label1.setFont(font1);
		label1.setForeground(Color.green);
		frame.add(label1);
		
		JLabel label2 = new JLabel();
		label2.setText("Put you id here: ");
		label2.setBounds(10, 70, 150, 30);
		Font font2 = new Font("Arial", Font.PLAIN, 20);
		label2.setFont(font2);
		label2.setForeground(Color.green);
		frame.add(label2);
		
		JTextField field22 = new JTextField();
		field22.setBounds(155, 70, 150, 20);
		frame.add(field22);
		
		JButton button = new JButton();
		button.setText("Submit");
		button.setBounds(370, 370, 80, 30);
		button.setBackground(new Color(35, 32, 79));
		button.setForeground(Color.white);
		frame.add(button);
		
		
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String id = field22.getText().trim();
				
				try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/SWING_DEMO", "root", "");

                    String query = "SELECT * FROM REGISTRATION WHERE id_num='" + id + "'";

                    Statement sta = connection.createStatement();
                    ResultSet rs = sta.executeQuery(query);

                    
                    Show show = new Show(rs);
                    
                    
                    connection.close();
                }
				
				catch (Exception exception) {
					JOptionPane.showInternalMessageDialog(null, "Something went wrong!.", "ERROR!", JOptionPane.ERROR_MESSAGE);
                    exception.printStackTrace();
                }
				
				
			}
		});
		
		
		frame.setVisible(true);
		
		
		
	}

}
