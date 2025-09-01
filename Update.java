import java.awt.Color;
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
import javax.swing.JTextField;

public class Update {
	
	Update() {
		
		JFrame frame = new JFrame();
		frame.setTitle("Update");
		frame.setSize(500,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		JLabel label1 = new JLabel();
		label1.setText("Update your info!");
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
		
		JLabel label8 = new JLabel();
		label8.setText("Fill up these fields for update: ");
		label8.setBounds(10, 120, 300, 20);
		label8.setForeground(Color.WHITE);
		frame.add(label8);
		
		JLabel label4 = new JLabel();
		label4.setText("Name: ");
		label4.setForeground(Color.white);
		label4.setBounds(10, 150, 50, 20);
		frame.add(label4);
		
		
		JTextField field4 = new JTextField();
		field4.setBounds(60, 150, 200, 20);
		frame.add(field4);
		
		JLabel label5 = new JLabel();
		label5.setText("Email: ");
		label5.setForeground(Color.white);
		label5.setBounds(10, 180, 50, 20);
		frame.add(label5);
		
		
		JTextField field5 = new JTextField();
		field5.setBounds(60, 180, 200, 20);
		frame.add(field5);
		
		
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
				String name = field4.getText().trim();
				String email = field5.getText().trim();
				
				try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/SWING_DEMO", "root", "");

                    String query = "UPDATE REGISTRATION SET name='" + name + "', email='" + email + "' WHERE id_num='" + id + "'";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);

                    if (x > 0) {
                        JOptionPane.showMessageDialog(null, "✅ Record updated successfully!");
                    } else {
                        JOptionPane.showMessageDialog(null, "⚠ No record found for given ID.");
                    }
                    
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
