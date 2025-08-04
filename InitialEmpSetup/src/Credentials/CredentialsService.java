package Credentials;

import java.security.*;

public class CredentialsService  {
	
	public String generateEmailAddress(String firstName,String lastName,String department) {
		return firstName + lastName + "@" + department + ".skit.org.in";
	}
	
	public String generatePassword(int length) {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+<>?/{}[]|";
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
        	password.append(chars.charAt(random.nextInt(chars.length())));
        }
        return password.toString();
	}
	
	public void display(String email,String password) {
		System.out.println("\n Your official credentials have been generated successfully!");
		System.out.println("------------------------------------------------------------");
		System.out.println(" Email Address : " + email);
		System.out.println(" Temporary Password : " + password);
		System.out.println("------------------------------------------------------------");
		System.out.println(" Please change your password after your first login.");

	}
}
