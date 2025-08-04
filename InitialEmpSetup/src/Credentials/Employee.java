package Credentials;

import java.util.*;

public class Employee {
	String firstName,lastName;
	public Employee(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CredentialsService cs=new CredentialsService();
		
		System.out.println("--------------------------------------------------");
		System.out.println("Welcome On Board! ");
		System.out.println("Let’s get you set up with your official credentials.");
		System.out.println("--------------------------------------------------\n");

		System.out.println("Enter Your First Name: ");
		String fName=sc.next().trim().toLowerCase();
		
		System.out.println("Enter Your Last Name: ");
		String lName=sc.next().trim().toLowerCase();
		
		Employee emp=new Employee(fName,lName);
		
		System.out.println("\nSelect the department you are assigned to:");
        System.out.println("1. Technical\n2. Admin\n3. Human Resources\n4. Lega\n5. Finance\n6. Library");
        
        System.out.print("Enter your Choice here: ");
        int deptChoice = +sc.nextInt(); 

        String department = switch (deptChoice) {
            case 1 -> "tech";
            case 2 -> "admin";
            case 3 -> "hr";
            case 4 -> "legal";
            case 5 -> "finance";
            case 6 -> "library";
            default -> "general";
        };
        
        String email = cs.generateEmailAddress(emp.firstName, emp.lastName, department);
        String password = cs.generatePassword(10);

        cs.display(email, password);
	}

}
