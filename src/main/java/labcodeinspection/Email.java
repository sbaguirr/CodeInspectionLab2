package labcodeinspection;

import java.util.Locale;

public class Email {

	private transient final String mFirstName;
	private transient final String mLastName;
	private transient String password;
	private transient String department;
	private transient final int passwordSize = 8;
	private transient String email;

	/**
	 * Constructor
	 * @param firstName
	 * @param lastName
	 */
	public Email(final String firstName, final String lastName) {
		this.mFirstName = firstName;
		this.mLastName = lastName;
		this.password=null;
	}

	/**
	 * Print user's name
	 */
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + mFirstName + "\nLAST NAME= " + mLastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}

	/**
	 * Select Departments
	 * @param depChoice
	 */
	public void setDeparment(final int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			break;
		}
	}

	private String randomPassword(final int length) {
		final String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
		final int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}

	/**
	 * Generate the email
	 */
	public void generateEmail() {
		this.password = this.randomPassword(this.passwordSize);
		this.email = this.mFirstName.toLowerCase(Locale.ENGLISH) + this.mLastName.toLowerCase(Locale.ENGLISH) + "@" + this.department
				+ ".espol.edu.ec";
	}
	
	
}
