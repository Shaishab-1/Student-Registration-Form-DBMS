import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Student Registration Form");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(850,950);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		ImageIcon icon = new ImageIcon("Image/pic_2.png");
		JLabel label3 = new JLabel(icon);
		label3.setBounds(0, 0, 850, 120);
		frame.add(label3);
		
		JLabel label2 = new JLabel();
		label2.setText("Student Registration Form");
		label2.setBounds(245, 130, 500, 30);
		label2.setForeground(Color.LIGHT_GRAY);
		Font font1 = new Font("Arial", Font.PLAIN, 30);
		label2.setFont(font1);
		frame.add(label2);
		
		JLabel label13 = new JLabel();
		label13.setText("Students Information: ");
		label13.setBounds(5, 170, 815, 30);
		label13.setForeground(Color.white);
		label13.setBackground(new Color(35, 32, 79));
		label13.setOpaque(true);
		frame.add(label13);
		
		JLabel label4 = new JLabel();
		label4.setText("Name: ");
		label4.setForeground(Color.white);
		label4.setBounds(5, 210, 50, 20);
		frame.add(label4);
		
		JLabel label400 = new JLabel();
		label400.setText("*");
		label400.setForeground(Color.red);
		label400.setBounds(45, 210, 5, 20);
		frame.add(label400);
		
		JTextField field1 = new JTextField();
		field1.setBounds(110, 210, 300, 20);
		frame.add(field1);
		
		JLabel label14 = new JLabel();
		label14.setText("Date of Birth: ");
		label14.setForeground(Color.white);
		label14.setBounds(5, 240, 100, 20);
		frame.add(label14);
		
		JLabel label500 = new JLabel();
		label500.setText("*");
		label500.setForeground(Color.red);
		label500.setBounds(82, 240, 5, 20);
		frame.add(label500);
		
		JTextField field7 = new JTextField();
		field7.setBounds(110, 240, 300, 20);
		frame.add(field7);
		
		JLabel label7 = new JLabel();
		label7.setText("Sex: ");
		label7.setBounds(5, 270, 50, 20);
		label7.setForeground(Color.WHITE);
		frame.add(label7);
		
		JLabel label600 = new JLabel();
		label600.setText("*");
		label600.setForeground(Color.red);
		label600.setBounds(33, 270, 5, 20);
		frame.add(label600);
		
		JRadioButton radio1 = new JRadioButton();
		radio1.setText("Male");
		radio1.setBackground(Color.DARK_GRAY);
		radio1.setForeground(Color.white);
		radio1.setBounds(110, 270, 70, 20);
		frame.add(radio1);
		
		JRadioButton radio2 = new JRadioButton();
		radio2.setText("Female");
		radio2.setBackground(Color.DARK_GRAY);
		radio2.setForeground(Color.white);
		radio2.setBounds(200, 270, 70, 20);
		frame.add(radio2);
		
		JRadioButton radio3 = new JRadioButton();
		radio3.setText("Others");
		radio3.setBackground(Color.DARK_GRAY);
		radio3.setForeground(Color.white);
		radio3.setBounds(305, 270, 70, 20);
		frame.add(radio3);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(radio1);
		group1.add(radio2);
		group1.add(radio3);
		
		JLabel label15 = new JLabel();
		label15.setText("Nationality: ");
		label15.setForeground(Color.white);
		label15.setBounds(5, 300, 100, 20);
		frame.add(label15);
		
		JTextField field8 = new JTextField();
		field8.setBounds(110, 300, 300, 20);
		frame.add(field8);
		
		JLabel label10 = new JLabel();
		label10.setText("Address: ");
		label10.setBounds(5, 330, 60, 20);
		label10.setForeground(Color.WHITE);
		frame.add(label10);
		
		JTextField field6 = new JTextField();
		field6.setBounds(110, 330, 300, 40);
		frame.add(field6);
		
		JLabel label11 = new JLabel();
		label11.setText("Blood Group: ");
		label11.setBounds(5, 380, 100, 20);
		label11.setForeground(Color.white);
		frame.add(label11);
		
		String[] string = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
		JComboBox<String> combo = new JComboBox<>(string);
		combo.setBounds(110, 380, 60, 20);
		frame.add(combo);
		
		JLabel label8 = new JLabel();
		label8.setText("Email: ");
		label8.setBounds(5, 410, 60, 20);
		label8.setForeground(Color.WHITE);
		frame.add(label8);
		
		JLabel label700 = new JLabel();
		label700.setText("*");
		label700.setForeground(Color.red);
		label700.setBounds(42, 410, 5, 20);
		frame.add(label700);
		
		JTextField field4 = new JTextField();
		field4.setBounds(110, 410, 300, 20);
		frame.add(field4);
		
		JLabel label9 = new JLabel();
		label9.setText("Mobile: ");
		label9.setBounds(5, 440, 60, 20);
		label9.setForeground(Color.WHITE);
		frame.add(label9);
		
		JLabel label800 = new JLabel();
		label800.setText("*");
		label800.setForeground(Color.red);
		label800.setBounds(48, 440, 5, 20);
		frame.add(label800);
		
		JTextField field5 = new JTextField();
		field5.setBounds(110, 440, 300, 20);
		frame.add(field5);
		
		JLabel label12 = new JLabel();
		label12.setText("Parents / Guardian Information: ");
		label12.setBounds(5, 470, 815, 30);
		label12.setForeground(Color.white);
		label12.setBackground(new Color(35, 32, 79));
		label12.setOpaque(true);
		frame.add(label12);
		
		JLabel label5 = new JLabel();
		label5.setText("Father's Name: ");
		label5.setForeground(Color.white);
		label5.setBounds(5, 510, 100, 20);
		frame.add(label5);
		
		JTextField field2 = new JTextField();
		field2.setBounds(110, 510, 300, 20);
		frame.add(field2);
		
		JLabel label6 = new JLabel();
		label6.setText("Mother's Name: ");
		label6.setForeground(Color.white);
		label6.setBounds(5, 540, 100, 20);
		frame.add(label6);
		
		JTextField field3 = new JTextField();
		field3.setBounds(110, 540, 300, 20);
		frame.add(field3);
		
//		JLabel label16 = new JLabel();
//		label16.setText("Address: ");
//		label16.setForeground(Color.white);
//		label16.setBounds(5, 655, 100, 20);
//		frame.add(label16);
//		
//		JTextField field9 = new JTextField();
//		field9.setBounds(110, 655, 300, 40);
//		frame.add(field9);
		
		JLabel label17 = new JLabel();
		label17.setText("Mobile: ");
		label17.setForeground(Color.white);
		label17.setBounds(5, 570, 100, 20);
		frame.add(label17);

		JTextField field10 = new JTextField();
		field10.setBounds(110, 570, 300, 20);
		frame.add(field10);
		
		JLabel label18 = new JLabel();
		label18.setText("Educational Information: ");
		label18.setBounds(5, 600, 815, 30);
		label18.setForeground(Color.white);
		label18.setBackground(new Color(35, 32, 79));
		label18.setOpaque(true);
		frame.add(label18);
		
//		JLabel label19 = new JLabel();
//		label19.setText("Student ID: ");
//		label19.setForeground(Color.white);
//		label19.setBounds(5, 785, 100, 20);
//		frame.add(label19);
//		
//		JTextField field11 = new JTextField();
//		field11.setBounds(110, 785, 300, 20);
//		frame.add(field11);
		
		JLabel label20 = new JLabel();
		label20.setText("Department: ");
		label20.setForeground(Color.white);
		label20.setBounds(5, 640, 80, 20);
		frame.add(label20);
		
		JLabel label200 = new JLabel();
		label200.setText("*");
		label200.setForeground(Color.red);
		label200.setBounds(78, 640, 5, 20);
		frame.add(label200);
		
		
		String[] string2 = {"BBA", "CSE", "EEE", "SE", "Economics", "English", "LLB"};
		JComboBox<String> combo1 = new JComboBox<>(string2);
		combo1.setBounds(110, 640, 120, 20);
		frame.add(combo1);

		JLabel label21 = new JLabel();
		label21.setText("Admission Year: ");
		label21.setForeground(Color.white);
		label21.setBounds(5, 670, 98, 20);
		frame.add(label21);
		
		
		JLabel label210 = new JLabel();
		label210.setText("*");
		label210.setForeground(Color.red);
		label210.setBounds(100, 670, 5, 20);
		frame.add(label210);
		
		JTextField field12 = new JTextField();
		field12.setBounds(110, 670, 120, 20);
		frame.add(field12);
		
		JLabel label22 = new JLabel();
		label22.setText("Semester: ");
		label22.setForeground(Color.white);
		label22.setBounds(430, 640, 70, 20);
		frame.add(label22);
		
		JLabel label220 = new JLabel();
		label220.setText("*");
		label220.setForeground(Color.red);
		label220.setBounds(490, 640, 5, 20);
		frame.add(label220);
		
		String[] string3 = {"SPRING", "SUMMER", "WINTER"};
		JComboBox<String> combo2 = new JComboBox<>(string3);
		combo2.setBounds(510, 640, 120, 20);
		frame.add(combo2);
		
		JLabel label212 = new JLabel();
		label212.setText("Degree: ");
		label212.setForeground(Color.white);
		label212.setBounds(430, 670, 50, 20);
		frame.add(label212);
		
		
		JLabel label213 = new JLabel();
		label213.setText("*");
		label213.setForeground(Color.red);
		label213.setBounds(475, 670, 5, 20);
		frame.add(label213);
		
		String[] string4 = {"B.Sc", "M.Sc"};
		JComboBox<String> combo3 = new JComboBox<>(string4);
		combo3.setBounds(510, 670, 120, 20);
		frame.add(combo3);
		
		JLabel label23 = new JLabel();
		label23.setBounds(5, 695, 815, 2);
		label23.setBackground(new Color(35, 32, 79));
		label23.setOpaque(true);
		frame.add(label23);
		
		JLabel label24 = new JLabel("Payment method: ");
		label24.setBounds(5, 705, 110, 20);
		label24.setForeground(Color.white);
		frame.add(label24);
		
		JLabel check2400 = new JLabel();
		check2400.setText("*");
		check2400.setForeground(Color.red);
		check2400.setBounds(107, 705, 5, 20);
		frame.add(check2400);
		
		JCheckBox check1 = new JCheckBox("Cash");
		check1.setBounds(125, 705, 80, 20);
		check1.setBackground(Color.DARK_GRAY);
		check1.setForeground(Color.white);
		frame.add(check1);
		
		JCheckBox check2 = new JCheckBox("Card");
		check2.setBounds(220, 705, 80, 20);
		check2.setBackground(Color.DARK_GRAY);
		check2.setForeground(Color.white);
		frame.add(check2);
		
		JCheckBox check3 = new JCheckBox("Mobile Banking");
		check3.setBounds(320, 705, 120, 20);
		check3.setBackground(Color.DARK_GRAY);
		check3.setForeground(Color.white);
		frame.add(check3);		
		
		JCheckBox check4 = new JCheckBox("I agree to all the terms and conditions for student registration.");
		check4.setBounds(5, 730, 375, 20);
		check4.setBackground(Color.DARK_GRAY);
		check4.setForeground(Color.white);
		frame.add(check4);
		
		JLabel check400 = new JLabel();
		check400.setText("*");
		check400.setForeground(Color.red);
		check400.setBounds(378, 730, 5, 20);
		frame.add(check400);
		
		JLabel label25 = new JLabel("*You must have to fill all the Required (*) fields.");
		label25.setForeground(Color.red);
		label25.setBounds(5, 760, 330, 20);
		label25.setForeground(Color.white);
		frame.add(label25);
		
		JButton button = new JButton();
		button.setText("Submit");
		button.setBounds(715, 750, 100, 30);
		button.setBackground(new Color(35, 32, 79));
		button.setForeground(Color.white);
		frame.add(button);
		


		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String name = field1.getText().trim();
				String dob = field7.getText().trim();
				String email = field4.getText().trim();
				String phone = field5.getText().trim();
				String year = field12.getText().trim();
				String sex = "";
				String dept = (String) combo1.getSelectedItem();
				String sem = (String) combo2.getSelectedItem();
				int len = phone.length();
				
				if(radio1.isSelected()) {
					sex = radio1.getText();
				} else if(radio2.isSelected()) {
					sex = radio2.getText();
				} else if(radio3.isSelected()) {
					sex = radio3.getText();
				}
				
				if(name.isEmpty() || dob.isEmpty() || sex.isEmpty() || email.isEmpty() || phone.isEmpty() || !check4.isSelected() || year.isEmpty()) {
					JOptionPane.showInternalMessageDialog(null, "Please fill all the required fields.", "ERROR!", JOptionPane.ERROR_MESSAGE);
				}
				else if(len != 11) {
					JOptionPane.showInternalMessageDialog(null, "Enter a Valid Mobile Number.", "Invalid!", JOptionPane.WARNING_MESSAGE);
				}
				else if(!check1.isSelected() && !check2.isSelected() && !check3.isSelected()) {
					JOptionPane.showInternalMessageDialog(null, "Select a payment method!.", "Warning!", JOptionPane.WARNING_MESSAGE);
				}
				else {
					
					String combo = (String) combo1.getSelectedItem();
					int departmentalCode = 0;
					
					switch (combo) {
					case "CSE": 
						departmentalCode = 115;
						break;
					case "EEE" :
						departmentalCode = 114;
						break;
					case "BBA" : 
						departmentalCode = 111;
						break;
					case "LLB" :
						departmentalCode = 112;
						break;
					case "English" :
						departmentalCode = 116;
						break;
					case "Economics" : 
						departmentalCode = 123;
						break;
					case "SE" : 
						departmentalCode = 122;
						break;
					}
					
					int sem_code = 0;
					
					switch(sem) {
					case "SPRING":
						sem_code = 1;
						break;
					case "SUMMER":
						sem_code = 2;
						break;
					case "WINTER":
						sem_code = 3;
						break;
					}
					
					String adYear = field12.getText().trim();
					int yearCode = 0;
					
					switch (adYear) {
					
					
					case "2010" : 
						yearCode = 10;
						break;
					case "2011" : 
						yearCode = 11;
						break;
					case "2012" : 
						yearCode = 12;
						break;
					case "2013" : 
						yearCode = 13;
						break;
					case "2014" : 
						yearCode = 14;
						break;
					case "2015" : 
						yearCode = 15;
						break;
					case "2016" : 
						yearCode = 16;
						break;
					case "2017" : 
						yearCode = 17;
						break;
					case "2018" : 
						yearCode = 18;
						break;
					case "2019" : 
						yearCode = 19;
						break;
					case "2020" : 
						yearCode = 20;
						break;
					case "2021" : 
						yearCode = 21;
						break;
					case "2022" : 
						yearCode = 22;
						break;
					case "2023" : 
						yearCode = 23;
						break;
					case "2024" : 
						yearCode = 24;
						break;
					case "2025" : 
						yearCode = 25;
						break;
					case "2026" : 
						yearCode = 26;
						break;
					case "2027" : 
						yearCode = 27;
						break;
					case "2028" : 
						yearCode = 28;
						break;
					case "2029" : 
						yearCode = 29;
						break;
					case "2030" : 
						yearCode = 30;
						break;
					case "2031" : 
						yearCode = 31;
						break;
					case "2032" : 
						yearCode = 32;
						break;
					case "2033" : 
						yearCode = 33;
						break;
					case "2034" : 
						yearCode = 34;
						break;
					case "2035" : 
						yearCode = 35;
						break;
					case "2036" : 
						yearCode = 36;
						break;
					case "2037" : 
						yearCode = 37;
						break;
					case "2038" : 
						yearCode = 38;
						break;
					case "2039" : 
						yearCode = 39;
						break;
					case "2040" : 
						yearCode = 40;
						break;
						
					}
					
					

					
					try {
						
						ID_Num idnum = new ID_Num(departmentalCode,yearCode,sem_code);
						
	                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/SWING_DEMO", "root", "");

	                    String query = "INSERT INTO REGISTRATION values('" + idnum.getID() + "','" + name + "','" + dob + "','" +
	                        email + "','" + phone + "','" + dept  + "','" + sex + "')";

	                    Statement sta = connection.createStatement();
	                    int x = sta.executeUpdate(query);
	           
	                    if (x == 0) {
	                        JOptionPane.showMessageDialog(null, "This is alredy exist");
	                    }
	                    
	                    connection.close();
	                }

					catch (Exception exception) {
						JOptionPane.showInternalMessageDialog(null, "Something went wrong!.", "ERROR!", JOptionPane.ERROR_MESSAGE);
	                    exception.printStackTrace();
	                }
					
				}
				
				
			}
			
		});
		
		
		JLabel label26 = new JLabel();
		label26.setBounds(5, 800, 815, 2);
		label26.setBackground(new Color(35, 32, 79));
		label26.setOpaque(true);
		frame.add(label26);
		
		JLabel label27 = new JLabel("Want to update your info?");
		label27.setForeground(Color.red);
		label27.setBounds(5, 810, 300, 20);
		Font font22 = new Font("Arial", Font.PLAIN, 20);
		label27.setFont(font22);
		label27.setForeground(Color.white);
		frame.add(label27);
		
		JButton UpdateButton = new JButton();
		UpdateButton.setText("Update");
		UpdateButton.setBounds(10, 860, 100, 30);
		UpdateButton.setBackground(new Color(35, 32, 79));
		UpdateButton.setForeground(Color.white);
		frame.add(UpdateButton);
		
		JButton DeleteButton = new JButton();
		DeleteButton.setText("Delete");
		DeleteButton.setBounds(140, 860, 100, 30);
		DeleteButton.setBackground(new Color(35, 32, 79));
		DeleteButton.setForeground(Color.white);
		frame.add(DeleteButton);
		
		JButton ReadButton = new JButton();
		ReadButton.setText("Search");
		ReadButton.setBounds(270, 860, 100, 30);
		ReadButton.setBackground(new Color(35, 32, 79));
		ReadButton.setForeground(Color.white);
		frame.add(ReadButton);
		
		UpdateButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Update update = new Update();
				
			}
		});
		
		DeleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				Delete delete = new Delete();
				
			}
		});
		
		ReadButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				Read read = new Read();
				
			}
		});
		
		
		// payment method cash card or mobile banking i can use checkbox here
		// then I agree to all the terms and conditions for student registration. here we also can use checkbox
		
		// if all the field is not selected or filled then we will show a message in dialogBox that you haven't completed registration else congrats
		
		frame.setVisible(true);
		

	}

} 
