import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.*;

import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.IOException;
import javax.swing.JLayeredPane;
import javax.swing.JPasswordField;
import javax.swing.JDesktopPane;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel panel;
	private JLabel lblNewLabel_3;
	private String lb1="";
	private String lb2="";
	private String lb3="";
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_4_1;
	private JLabel lblNewLabel_4_2;

	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("goCorona Updater");
		lblNewLabel_1.setForeground(new Color(0, 0, 205));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1.setBounds(227, -13, 248, 63);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("WELCOME");
		lblNewLabel.setForeground(new Color(0, 51, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(0, 0, 75, 35);
		contentPane.add(lblNewLabel);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(new Color(218, 165, 32));
		toolBar.setBounds(687, 0, 97, 35);
		contentPane.add(toolBar);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("Sign in");
		tglbtnNewToggleButton_1.addActionListener(new ActionListener() {
			@SuppressWarnings({ "deprecation", "static-access" })
			public void actionPerformed(ActionEvent e) {
				
				Run_GUI login =new Run_GUI();
				login.frmLogin.show();
				hide();
				
			}
		});
		tglbtnNewToggleButton_1.setFont(new Font("Stencil", Font.BOLD, 15));
		toolBar.add(tglbtnNewToggleButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Country :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setBounds(10, 83, 103, 23);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBackground(new Color(176, 224, 230));
		textField.addFocusListener(new FocusAdapter() {
			
		});
		textField.setColumns(10);
		textField.setBounds(14, 106, 139, 23);
		contentPane.add(textField);
		
		JLabel lblNewLabel_2_1 = new JLabel("State :");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2_1.setBounds(10, 151, 103, 23);
		contentPane.add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(176, 224, 230));
		textField_1.setColumns(10);
		textField_1.setBounds(14, 185, 139, 23);
		contentPane.add(textField_1);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Show");
		tglbtnNewToggleButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		tglbtnNewToggleButton.setForeground(new Color(0, 100, 0));
		tglbtnNewToggleButton.setBackground(new Color(143, 188, 143));
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultCategoryDataset dcd=new DefaultCategoryDataset();
				MAIN main=new MAIN();
				main.Country=textField.getText();
				main.State=textField_1.getText();
				main.RUN();
				
				
				
				int c,r,d;
				String name = null;
				
				if (main.Country.toUpperCase().equals("INDIA") && main.State.equals("null")==false) {
				c=main.Scases;
				r=main.Srecovers;
				d=main.Sdeaths;
				name=main.State;
				
				lb1="cases = \n"+c;
				lb2="recover = \n"+r;
				lb3="death = \n"+d;
				}
				else if (main.Country.toUpperCase().equals("INDIA") && main.State.equals("null")) {
					c=main.Ccases;
					r=main.Crecovers;
					d=main.Cdeaths;
					name=main.Country;
					
					lb1="cases = \n"+c;
					lb2="recover \n= "+r;
					lb3="death = \n"+d;
				}
				
				else if(main.Country.toUpperCase().equals("INDIA")==false && main.State.equals("null")){
					c=main.Ccases;
					r=main.Crecovers;
					d=main.Cdeaths;
					name=main.Country;
					
					lb1="";
					lb2="";
					lb3="";
					
				}
				else {
					c=main.Ccases;
					r=main.Crecovers;
					d=main.Cdeaths;
					
					
				}
				
				
				if(c==-1& r==-1 && d==-1) {
					panel.add(lblNewLabel_3);
					panel.updateUI();
					
				}
				else {
				
				
				dcd.setValue(c, "people", "Cases");
				dcd.setValue(r, "people", "Recovered");
				dcd.setValue(d, "people", "Deaths");
				
				JFreeChart  jChart=ChartFactory.createBarChart3D("Report", name , "People", dcd, PlotOrientation.VERTICAL, false, true, false);
				CategoryPlot plot= jChart.getCategoryPlot();
				plot.setRangeGridlinePaint(Color.black);
				
				//ChartFrame chartfrm =new ChartFrame("Report",jChart,true);
				//chartfrm.setVisible(true);
				//chartfrm.setSize(500,400);
				if (tglbtnNewToggleButton.isSelected()) {
				ChartPanel ChartPanel=new  ChartPanel(jChart);
				panel.removeAll();
				panel.updateUI();
				panel.add(ChartPanel);
				panel.updateUI();
				
				lblNewLabel_4.setText(lb1);
				lblNewLabel_4_1.setText(lb2);
				lblNewLabel_4_2.setText(lb3);
				
				}
				else {
					panel.removeAll();
					panel.updateUI();
					lblNewLabel_4.setText("");
					lblNewLabel_4_1.setText("");
					lblNewLabel_4_2.setText("");
				}
				
				
			}}
		});
		tglbtnNewToggleButton.setBounds(10, 377, 121, 23);
		contentPane.add(tglbtnNewToggleButton);
		 
	
		
		 panel = new JPanel();
		 panel.setBackground(Color.WHITE);
		panel.setBounds(171, 35, 603, 376);
		contentPane.add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		 lblNewLabel_3 = new JLabel("NO data found");
		 lblNewLabel_3.setBackground(new Color(222, 184, 135));
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel.add(lblNewLabel_3, "name_977767380271300");
		panel.remove(lblNewLabel_3);
		
		
		
		
		lblNewLabel_4 = new JLabel(lb1);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setBackground(new Color(0, 0, 255));
		lblNewLabel_4.setForeground(new Color(0, 0, 255));
		lblNewLabel_4.setFont(new Font("Source Code Pro Light", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_4.setBounds(10, 249, 182, 23);
		contentPane.add(lblNewLabel_4);
		
		 lblNewLabel_4_1 = new JLabel(lb2);
		 lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.LEFT);
		 lblNewLabel_4_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_4_1.setFont(new Font("Source Code Pro Light", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_4_1.setBounds(10, 283, 182, 23);
		contentPane.add(lblNewLabel_4_1);
		
		lblNewLabel_4_2 = new JLabel(lb3);
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_4_2.setFont(new Font("Source Code Pro Light", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_4_2.setBounds(10, 310, 182, 23);
		contentPane.add(lblNewLabel_4_2);
	}
}
