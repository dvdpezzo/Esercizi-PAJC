package it.unibs.pajc.mail;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Mail 
{
	
	public static void mainSendMail(String strDest, String strPers) 
	{
		//costanti con le credenziali di accesso alla casella e-mail di spedizione
		final String username = "tartaruga.man2@gmail.com";
		final String password = "tartatarta1";
		
		//Parametri di connessione per una casella di posta gmail
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		// connessione al server di posta
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {
			Message message = new MimeMessage(session);
			
			//setto mittente, destinatario e oggetto
			
			message.setFrom(new InternetAddress("tartaruga.man2@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(strDest));
			
			message.setSubject("20 Ottobre 2017 - SAVE THE DATE");
			
			strPers = strPers + "\nSiamo lieti di invitarla alle esercitazioni di Java \n";
			
			message.setText(strPers);
			
			//spedisco messaggio
			Transport.send(message);

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
	
}