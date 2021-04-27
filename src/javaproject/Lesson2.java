package javaproject;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Lesson2 {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson2 window = new Lesson2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lesson2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 415, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 786, 563);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("�α���");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(262, 463, 91, 23);
		panel.add(btnNewButton);
		
		JLabel IDlabel = new JLabel("���̵�");
		IDlabel.setFont(new Font("����", Font.PLAIN, 20));
		IDlabel.setBounds(64, 220, 63, 41);
		panel.add(IDlabel);
		
		JLabel txtPass = new JLabel("��й�ȣ");//JLabel lblNewLabel_1 = new JLabel("�н�����");
		txtPass.setFont(new Font("����", Font.PLAIN, 20));
		txtPass.setBounds(43, 286, 84, 29);
		panel.add(txtPass);
		
		textField = new JTextField();
		textField.setBounds(172, 232, 181, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(172, 292, 181, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("twh���α׷�");
		lblNewLabel_2.setFont(new Font("����", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(107, 48, 199, 72);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("ȸ������");
		btnNewButton_1.setBounds(262, 416, 91, 23);
		panel.add(btnNewButton_1);
	}
}
