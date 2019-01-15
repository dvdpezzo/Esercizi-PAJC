package it.unibs.pajc.mail;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MailWindow {

	private JFrame frmMailSender;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MailWindow window = new MailWindow();
					window.frmMailSender.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MailWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMailSender = new JFrame();
		frmMailSender.setResizable(false);
		frmMailSender.setTitle("Mail Sender");
		frmMailSender.setBounds(100, 100, 450, 393);
		frmMailSender.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMailSender.getContentPane().setLayout(null);
		
		JLabel lblDestinatario = new JLabel("Destinatario");
		lblDestinatario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDestinatario.setBounds(33, 20, 88, 30);
		frmMailSender.getContentPane().add(lblDestinatario);
		
		JLabel lblOggetto = new JLabel("Oggetto");
		lblOggetto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOggetto.setBounds(33, 67, 88, 30);
		frmMailSender.getContentPane().add(lblOggetto);
		
		JTextPane textMail = new JTextPane();
		textMail.setBounds(20, 123, 397, 131);
		frmMailSender.getContentPane().add(textMail);
		
		JTextPane textDest = new JTextPane();
		textDest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textDest.setBounds(137, 20, 280, 30);
		frmMailSender.getContentPane().add(textDest);
		
		JTextPane textSub = new JTextPane();
		textSub.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textSub.setBounds(137, 67, 280, 30);
		frmMailSender.getContentPane().add(textSub);
		
		JButton btnSend = new JButton("Send");
		btnSend.setBounds(170, 308, 112, 39);
		frmMailSender.getContentPane().add(btnSend);
		
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Mail.mainSendMail(textDest.getText(), "test");
			}
		});
	}
}
