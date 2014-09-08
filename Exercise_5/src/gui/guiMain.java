package gui;


import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import dataBase.MySql;

import javax.swing.JTextArea;

import dataBase.readDB;

import javax.swing.JInternalFrame;

import java.awt.BorderLayout;


public class guiMain implements ActionListener
{

	private JPanel contentPane;
	private JPanel contentPane1;
	
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	JFrame frame = new JFrame("Welcome");
	JFrame frameListe = new JFrame("Se listen");
	JButton btnOpret = new JButton("Opret");
	JTextField textField_navn = new JTextField();
	JTextArea textArea = new JTextArea();
	MySql DBconnect = new MySql();
	readDB DBread = new readDB();
	
	
	JTextArea textArea_1 = new JTextArea();
	
	/**
	 * Create the frame.
	 */
	public guiMain() throws Exception
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNavn = new JLabel("Navn :");
		lblNavn.setBounds(36, 27, 61, 16);
		contentPane.add(lblNavn);
		
		JLabel lblEfternavn = new JLabel("Efternavn :");
		lblEfternavn.setBounds(36, 68, 81, 16);
		contentPane.add(lblEfternavn);
		
		JLabel lblTelefon = new JLabel("Telefon :");
		lblTelefon.setBounds(36, 113, 61, 16);
		contentPane.add(lblTelefon);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setBounds(36, 154, 61, 16);
		contentPane.add(lblEmail);
		
		
		btnOpret.setBounds(216, 225, 117, 29);
		contentPane.add(btnOpret);
		
		
		textField_navn.setBounds(89, 21, 244, 28);
		contentPane.add(textField_navn);
		textField_navn.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(114, 62, 219, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(101, 107, 232, 28);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(89, 148, 244, 28);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		
		textArea.setBounds(21, 179, 423, 36);
		contentPane.add(textArea);
		
		
		textField_navn.addActionListener(this);
		textField_1.addActionListener(this);
		textField_2.addActionListener(this);
		textField_3.addActionListener(this);
		btnOpret.addActionListener(this);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		
		
		
		if(e.getSource() == btnOpret)
		{
			String name = textField_navn.getText();
			String lastName = textField_1.getText();
			int phone = Integer.parseInt(textField_2.getText());
			String mail = textField_3.getText();
			
			try {
				DBconnect.insertDB(name, lastName, phone, mail);
				textField_navn.setText(" ");
				textField_1.setText(" ");
				textField_2.setText("");
				textField_3.setText(" ");
				
				textArea.setText(DBread.arrayToString());
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				
			}
			
		}
		
		
	}
}
