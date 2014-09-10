package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

import Database.readDB;

public class guiMain implements ActionListener  {

	private JPanel contentPane;
	JButton btnSg = new JButton("Search");
	JFrame frame = new JFrame("Product search");
	readDB DBread = new readDB();
	JTextArea textArea = new JTextArea();
	JTextField textField = new JTextField();
	private final JButton btnClear = new JButton("Clear");
	
	/**
	 * Create the frame.
	 */
	public guiMain() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSg = new JLabel("S\u00F8g");
		lblSg.setBounds(35, 82, 61, 16);
		contentPane.add(lblSg);
		
		
		textField.setBounds(77, 76, 287, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		btnSg.setBounds(246, 138, 117, 29);
		contentPane.add(btnSg);
		
		JLabel lblDuKanSge = new JLabel("You can search on brand name");
		lblDuKanSge.setBounds(77, 22, 287, 39);
		contentPane.add(lblDuKanSge);
		
		
		textArea.setBounds(35, 194, 390, 66);
		contentPane.add(textArea);
		btnClear.setBounds(87, 138, 117, 29);
		
		contentPane.add(btnClear);
		
		btnSg.addActionListener(this);
		btnClear.addActionListener(this);
		textField.addActionListener(this);
		frame.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource() == btnSg)
		{
			
			
			try {
				
				String name = textField.getText();
				DBread.dataBaseRead(name);
				textArea.setText(DBread.arrayToString());
				textField.setText("");
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				
			}
			
		}
		if(e.getSource() == btnClear)
		{
			
			textArea.setText("");
			
			
		}
		
		
	}
}
