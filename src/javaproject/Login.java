package javaproject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

	

	public class Login extends JFrame{
		public Login() {
			JPanel panel = new JPanel();
			JLabel label = new JLabel("ID :");
			JLabel pswrd = new JLabel("Password :");
			
			JTextField txtID =new JTextField(10);
			JPasswordField txtPass = new JPasswordField(10);
			JButton logBtn = new JButton("Log in");
			panel.add(label);
			panel.add(txtID);
			panel.add(pswrd);
			panel.add(txtPass);
			panel.add(logBtn);
			logBtn.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String id = "vnd0106";
					String pass = "vndwl0106";
					
					if(id.equals(txtID.getText())&&pass.equals(txtPass.getText())) {
						JOptionPane.showMessageDialog(null, "You have logged in sucessfully");
					}else {
						JOptionPane.showMessageDialog(null, "babo sekki");
						
					}
				}
				
			});
			add(panel);
			
			
			
			
			setVisible(true);
			setSize(600,400);
			setLocationRelativeTo(null);
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 new Login();
	}

}
