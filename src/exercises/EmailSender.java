package exercises;

import java.util.Random;

import javax.swing.JOptionPane;

public class EmailSender {

	void go() {
		/*
		 * Use the methods below to send an email and print a warning if the email did
		 * not send correctly.
		 */
		String email = JOptionPane.showInputDialog("Enter e-mail address of the recipient:");
		setEmailAddress(email);
		String message = JOptionPane.showInputDialog("Enter your message:");
		if (send(message) && isValid(email))
			JOptionPane.showMessageDialog(null, "E-mail sent");
		else
			JOptionPane.showMessageDialog(null, "E-mail was not sent");

	}

	/*
	 * Not enough for valid email address, but it should start from somewhere. The
	 * method checks only for '@' and '.' as mandatory parts of every email address.
	 */
	boolean isValid(String email) {
		if (!(this.emailAddress.contains("@") && this.emailAddress.contains("."))) {
			System.err.println("Invalid email address.");
			return false;
		}
		return true;
	}

	/* Returns true if email was sent successfully, false if it failed to send. */
	boolean send(String greeting) {
		if (this.emailAddress.isEmpty()) {
			System.err.println("You did not provide a recipient for the email. Try adding one now.");
			return false;
		}
		return new Random().nextBoolean();
		//return true;
	}

	private String emailAddress = "";

	void setEmailAddress(String email) {
		this.emailAddress = email;
	}

	public static void main(String[] args) {
		new EmailSender().go();
	}
}
