package com.blq.fr.gestionDesOffresBackend.messagerie;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EnvoyerEmail {
	
//	  private final static String MAILER_VERSION = "Java";
//	  public static String mail_destinataire = "clementescande@3wa.io";
//	  
//	  public static void envoyer() {
//		  
//	    try {
//	    	
//	      Properties prop = System.getProperties();
//	      prop.put("mail.smtp.host", "10.10.50.8");
//	      Session session = Session.getDefaultInstance(prop,null);
//	      Message message = new MimeMessage(session);
//	      message.setFrom(new InternetAddress(mail_destinataire));
//	      InternetAddress[] internetAddresses = new InternetAddress[1];
//	      internetAddresses[0] = new InternetAddress(mail_destinataire);
//	      message.setRecipients(Message.RecipientType.TO,internetAddresses);
//	      message.setSubject("Test");
//	      message.setText("test mail");
//	      message.setHeader("X-Mailer", MAILER_VERSION);
//	      message.setSentDate(new Date());
//	      session.setDebug(true);
//	      Transport.send(message);
//	      
//	    } catch (AddressException e) {
//	    	
//	      e.printStackTrace();
//	      
//	    } catch (MessagingException e) {
//	    	
//	      e.printStackTrace();
//	      
//	    }
	    
	static public String username = "clement.escande@epsi.fr";
	static public String password = "";

	public void envoyer() {
		  
		// etape1 : creation d'une session
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.office365.com");
//		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "587");
		
		Session session = Session.getInstance( props, 
				new Authenticator() {
			
			protected PasswordAuthentication getpasswordAuthentication() {
				return new PasswordAuthentication( username, password );
			}
		});
		
		try {
			
			//etape2 : creation d'un message
			Message message = new MimeMessage(session);
			message.setFrom( new InternetAddress(username) );
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(username));
			message.setSubject("Test javaMail API");
			message.setText("Bonjour, ceci est un message de test");
			
			//etape3 : envoi
			Transport.send(message);
			
			System.out.println("message envoyé");
			
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		
	}
}