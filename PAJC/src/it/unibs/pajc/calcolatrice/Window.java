package it.unibs.pajc.calcolatrice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Window {

	private JFrame frmCalcolatrice;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frmCalcolatrice.setVisible(true);
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
		frmCalcolatrice = new JFrame();
		frmCalcolatrice.setTitle("Calcolatrice");
		frmCalcolatrice.setResizable(false);
		frmCalcolatrice.setBounds(100, 100, 328, 364);
		frmCalcolatrice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {64, 64, 64, 64, 62, 0};
		gridBagLayout.rowHeights = new int[] {64, 64, 64, 64, 59, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmCalcolatrice.getContentPane().setLayout(gridBagLayout);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setEditable(false);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridwidth = 5;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		frmCalcolatrice.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btn7 = new GridBagConstraints();
		gbc_btn7.fill = GridBagConstraints.BOTH;
		gbc_btn7.insets = new Insets(0, 0, 5, 5);
		gbc_btn7.gridx = 0;
		gbc_btn7.gridy = 1;
		frmCalcolatrice.getContentPane().add(btn7, gbc_btn7);
		
		JButton btn8 = new JButton("8");
		GridBagConstraints gbc_btn8 = new GridBagConstraints();
		gbc_btn8.fill = GridBagConstraints.BOTH;
		gbc_btn8.insets = new Insets(0, 0, 5, 5);
		gbc_btn8.gridx = 1;
		gbc_btn8.gridy = 1;
		frmCalcolatrice.getContentPane().add(btn8, gbc_btn8);
		
		JButton btn9 = new JButton("9");
		GridBagConstraints gbc_btn9 = new GridBagConstraints();
		gbc_btn9.fill = GridBagConstraints.BOTH;
		gbc_btn9.insets = new Insets(0, 0, 5, 5);
		gbc_btn9.gridx = 2;
		gbc_btn9.gridy = 1;
		frmCalcolatrice.getContentPane().add(btn9, gbc_btn9);
		
		JButton btnDiv = new JButton("/");
		GridBagConstraints gbc_btnDiv = new GridBagConstraints();
		gbc_btnDiv.fill = GridBagConstraints.BOTH;
		gbc_btnDiv.insets = new Insets(0, 0, 5, 5);
		gbc_btnDiv.gridx = 3;
		gbc_btnDiv.gridy = 1;
		frmCalcolatrice.getContentPane().add(btnDiv, gbc_btnDiv);
		
		JButton btn4 = new JButton("4");
		GridBagConstraints gbc_btn4 = new GridBagConstraints();
		gbc_btn4.fill = GridBagConstraints.BOTH;
		gbc_btn4.insets = new Insets(0, 0, 5, 5);
		gbc_btn4.gridx = 0;
		gbc_btn4.gridy = 2;
		frmCalcolatrice.getContentPane().add(btn4, gbc_btn4);
		
		JButton btn5 = new JButton("5");
		GridBagConstraints gbc_btn5 = new GridBagConstraints();
		gbc_btn5.fill = GridBagConstraints.BOTH;
		gbc_btn5.insets = new Insets(0, 0, 5, 5);
		gbc_btn5.gridx = 1;
		gbc_btn5.gridy = 2;
		frmCalcolatrice.getContentPane().add(btn5, gbc_btn5);
		
		JButton btn6 = new JButton("6");
		GridBagConstraints gbc_btn6 = new GridBagConstraints();
		gbc_btn6.fill = GridBagConstraints.BOTH;
		gbc_btn6.insets = new Insets(0, 0, 5, 5);
		gbc_btn6.gridx = 2;
		gbc_btn6.gridy = 2;
		frmCalcolatrice.getContentPane().add(btn6, gbc_btn6);
		
		JButton btnMolt = new JButton("*");
		GridBagConstraints gbc_btnMolt = new GridBagConstraints();
		gbc_btnMolt.fill = GridBagConstraints.BOTH;
		gbc_btnMolt.insets = new Insets(0, 0, 5, 5);
		gbc_btnMolt.gridx = 3;
		gbc_btnMolt.gridy = 2;
		frmCalcolatrice.getContentPane().add(btnMolt, gbc_btnMolt);
		
		JButton btnDel = new JButton("C");
		GridBagConstraints gbc_btnDel = new GridBagConstraints();
		gbc_btnDel.fill = GridBagConstraints.BOTH;
		gbc_btnDel.insets = new Insets(0, 0, 5, 0);
		gbc_btnDel.gridx = 4;
		gbc_btnDel.gridy = 2;
		frmCalcolatrice.getContentPane().add(btnDel, gbc_btnDel);
		
		JButton btn1 = new JButton("1");
		GridBagConstraints gbc_btn1 = new GridBagConstraints();
		gbc_btn1.fill = GridBagConstraints.BOTH;
		gbc_btn1.insets = new Insets(0, 0, 5, 5);
		gbc_btn1.gridx = 0;
		gbc_btn1.gridy = 3;
		frmCalcolatrice.getContentPane().add(btn1, gbc_btn1);
		
		JButton btn2 = new JButton("2");
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.fill = GridBagConstraints.BOTH;
		gbc_btn2.insets = new Insets(0, 0, 5, 5);
		gbc_btn2.gridx = 1;
		gbc_btn2.gridy = 3;
		frmCalcolatrice.getContentPane().add(btn2, gbc_btn2);
		
		JButton btn3 = new JButton("3");
		GridBagConstraints gbc_btn3 = new GridBagConstraints();
		gbc_btn3.fill = GridBagConstraints.BOTH;
		gbc_btn3.insets = new Insets(0, 0, 5, 5);
		gbc_btn3.gridx = 2;
		gbc_btn3.gridy = 3;
		frmCalcolatrice.getContentPane().add(btn3, gbc_btn3);
		
		JButton btnMin = new JButton("-");
		GridBagConstraints gbc_btnMin = new GridBagConstraints();
		gbc_btnMin.fill = GridBagConstraints.BOTH;
		gbc_btnMin.insets = new Insets(0, 0, 5, 5);
		gbc_btnMin.gridx = 3;
		gbc_btnMin.gridy = 3;
		frmCalcolatrice.getContentPane().add(btnMin, gbc_btnMin);
		
		JButton btnBack = new JButton("<-");
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.fill = GridBagConstraints.BOTH;
		gbc_btnBack.insets = new Insets(0, 0, 5, 0);
		gbc_btnBack.gridx = 4;
		gbc_btnBack.gridy = 3;
		frmCalcolatrice.getContentPane().add(btnBack, gbc_btnBack);
		
		JButton btnPoint = new JButton(".");
		GridBagConstraints gbc_btnPoint = new GridBagConstraints();
		gbc_btnPoint.fill = GridBagConstraints.BOTH;
		gbc_btnPoint.insets = new Insets(0, 0, 0, 5);
		gbc_btnPoint.gridx = 0;
		gbc_btnPoint.gridy = 4;
		frmCalcolatrice.getContentPane().add(btnPoint, gbc_btnPoint);
		
		JButton btn0 = new JButton("0");
		GridBagConstraints gbc_btn0 = new GridBagConstraints();
		gbc_btn0.fill = GridBagConstraints.BOTH;
		gbc_btn0.insets = new Insets(0, 0, 0, 5);
		gbc_btn0.gridx = 1;
		gbc_btn0.gridy = 4;
		frmCalcolatrice.getContentPane().add(btn0, gbc_btn0);
		
		JButton btnEq = new JButton("=");
		GridBagConstraints gbc_btnEq = new GridBagConstraints();
		gbc_btnEq.insets = new Insets(0, 0, 0, 5);
		gbc_btnEq.fill = GridBagConstraints.BOTH;
		gbc_btnEq.gridx = 2;
		gbc_btnEq.gridy = 4;
		frmCalcolatrice.getContentPane().add(btnEq, gbc_btnEq);
		
		JButton btnPls = new JButton("+");
		GridBagConstraints gbc_btnPls = new GridBagConstraints();
		gbc_btnPls.fill = GridBagConstraints.BOTH;
		gbc_btnPls.insets = new Insets(0, 0, 0, 5);
		gbc_btnPls.gridx = 3;
		gbc_btnPls.gridy = 4;
		frmCalcolatrice.getContentPane().add(btnPls, gbc_btnPls);
	}
}
