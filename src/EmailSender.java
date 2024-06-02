import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class EmailSender {
    public static void main(String[] args) throws MessagingException {
        // Recipient's email ID needs to be mentioned.
        String to = "FIXME";

        // Sender's email ID needs to be mentioned
        String from = "FIXME";
        final String username = "FIXME"; // your Gmail username (or any other email service)
        final String password = "FIXME"; // your Gmail password (or any other email service)

        // Assuming you are sending email through relay.jangosmtp.net
        String host = "smtp.gmail.com";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");

        // Get the Session object.
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });


        // Create a default MimeMessage object.
        Message message = new MimeMessage(session);

        // Set From: header field of the header.
        message.setFrom(new InternetAddress(from));

        // Set To: header field of the header.
        message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(to));

        // Set Subject: header field
        message.setSubject("Testing Subject");

        // Now set the actual message
        message.setText("Hello, this is sample for to check send " +
                "email using JavaMailAPI ");

        // Send message
        Transport.send(message);

        System.out.println("Sent message successfully....");

    }
}

