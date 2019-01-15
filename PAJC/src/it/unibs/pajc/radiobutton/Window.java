package it.unibs.pajc.radiobutton;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JProgressBar;

public class Window extends JFrame{

	private JFrame frame;
	private ButtonGroup g = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
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
	public Window() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LABEL");
		lblNewLabel.setBounds(176, 44, 95, 78);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnSmall = new JRadioButton("Small");
		rdbtnSmall.setSelected(true);
		rdbtnSmall.setBounds(26, 203, 111, 23);
		frame.getContentPane().add(rdbtnSmall);
		
		JRadioButton rdbtnMedium = new JRadioButton("Medium");
		rdbtnMedium.setBounds(148, 203, 111, 23);
		frame.getContentPane().add(rdbtnMedium);
		
		JRadioButton rdbtnLarge = new JRadioButton("Large");
		rdbtnLarge.setBounds(280, 203, 111, 23);
		frame.getContentPane().add(rdbtnLarge);
		
		g.add(rdbtnSmall);
		g.add(rdbtnMedium);
		g.add(rdbtnLarge);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(125, 133, 168, 34);
		frame.getContentPane().add(progressBar);
		
		progressBar.setIndeterminate(true);
		
	}
}



