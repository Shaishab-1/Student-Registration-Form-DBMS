import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ID_Num {
	
	private String ID;
	ID_Num(int departmentalCode, int yearCode, int sem_code) {
		
		JFrame frame = new JFrame();
		frame.setTitle("ID");
		frame.setSize(500,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		JLabel label1 = new JLabel();
		label1.setText("Your form has been registered successfully!");
		label1.setBounds(45, 30, 440, 30);
		Font font1 = new Font("Arial", Font.PLAIN, 20);
		label1.setFont(font1);
		label1.setForeground(Color.green);
		frame.add(label1);
		
		JLabel label = new JLabel();
		label.setText("Your student ID is : " + yearCode  + "" +  sem_code + "-" + departmentalCode + "-" + 200);
		Font font2 = new Font("Arial", Font.PLAIN, 20);
		label.setFont(font2);
		label.setBounds(85, 100, 400, 30);
		label.setForeground(Color.green);
		frame.add(label);
		

		
		
		this.ID = yearCode  + "" +  sem_code +"-"+departmentalCode+"-"+200;
		
		
		
		frame.setVisible(true);
	}
	public String getID() {
        return ID;
    }
	

}
