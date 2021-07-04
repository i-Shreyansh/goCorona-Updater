import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Run_GUI {

	static JFrame frmLogin;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Run_GUI window = new Run_GUI();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Run_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.getContentPane().setBackground(Color.ORANGE);
		frmLogin.setTitle("LOGIN");
		frmLogin.setBounds(100, 100, 800, 450);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("goCorona Updater");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(213, 0, 248, 63);
		frmLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN*");
		lblNewLabel_1.setBackground(new Color(124, 252, 0));
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD, 18));
		lblNewLabel_1.setBounds(224, 138, 100, 38);
		frmLogin.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("User name  :");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Sylfaen", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(71, 199, 100, 38);
		frmLogin.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Password  :");
		lblNewLabel_1_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1_1.setFont(new Font("Sylfaen", Font.BOLD, 17));
		lblNewLabel_1_1_1.setBounds(71, 274, 100, 38);
		frmLogin.getContentPane().add(lblNewLabel_1_1_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(173, 216, 230));
		textField.setBounds(213, 199, 272, 26);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(176, 224, 230));
		passwordField.setBounds(213, 274, 272, 26);
		frmLogin.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Continue without login");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				Home home=new Home();
				home.setVisible(true);
				frmLogin.hide();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(471, 344, 245, 43);
		frmLogin.getContentPane().add(btnNewButton);
		
		JLabel lblliveCovidCases = new JLabel("(Live covid-19 cases)");
		lblliveCovidCases.setHorizontalAlignment(SwingConstants.LEFT);
		lblliveCovidCases.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblliveCovidCases.setBounds(471, 59, 154, 63);
		frmLogin.getContentPane().add(lblliveCovidCases);
		
		JButton btnNewButton_1 = new JButton("SUBMIT");
		btnNewButton_1.setBackground(new Color(154, 205, 50));
		btnNewButton_1.setForeground(new Color(0, 100, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String U,P;
			U=textField.getText();
			P=passwordField.getText();
			Home home=new Home();
			if (U.equals("Admin") && P.equals("Admin")) {
				home.setVisible(true);
			}
			else
				JOptionPane.showMessageDialog(btnNewButton_1, "Incorrect Ussername or Password");
				
			
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(535, 274, 181, 43);
		frmLogin.getContentPane().add(btnNewButton_1);
		
		JButton btnSignup = new JButton("SIGN UP");
		btnSignup.setBackground(new Color(135, 206, 250));
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSignup.setFont(new Font("Stencil", Font.BOLD, 18));
		btnSignup.setBounds(316, 136, 166, 43);
		frmLogin.getContentPane().add(btnSignup);
	}
}
