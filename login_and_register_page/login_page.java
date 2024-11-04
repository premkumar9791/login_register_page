package login_and_register_page;


import java.util.ArrayList;
import java.util.Scanner;

public class login_page {

	public static void main(String[] args) {
		
		// Features of the Login and Registration System:
		
		// 1. User Registration:
//		    - Allows new users to register by providing their name, email, and password.
//		    - Successfully registered users are added to the user list.
		
		// 2. User Login:
//		    - Existing users can log in by entering their registered email and password.
//		    - Validates user credentials against the registered user list.
		
		// 3. Email and Password Verification:
//		    - Checks if the entered email and password match any registered user account.
//		    - Displays a welcome message upon successful login.
		

		// 4. Exit Option:
//		    - Allows users to exit the application gracefully with a thank you message.

		
		ArrayList<register> log=new ArrayList<>();
		
		Scanner s=new Scanner(System.in);
		boolean loop=true;
		
		while(loop) {
			System.out.println("choose any one\n1.login \n2.register\n3.exit");
			int n=s.nextInt();
			
			switch(n) {
			case 1:{
				System.out.println("enter your email:");
				String email=s.next();
				System.out.println("enter your password:");
				String password=s.next();
				if(loginId(email,password,log)) {
				for(register t:log) {
					if(t.password.equals(password)&&t.email.equals(email)) {
						System.out.println("Welcome " +t.name +" you login your acount successfully!");
						loop=false;
						s.close();
						break;
					}
				}
				}
				else {
					System.out.println("wrong emailId password!");
				}
				 break;
			}
			case 2:{
				System.out.println("enter your name:");
				String name=s.next();
				System.out.println("enter your email:");
				String email=s.next();
				System.out.println("enter your password:");
				String password=s.next();
				log.add(new register(name,email,password));
				System.out.println("register successfully!");
				 break;
			}
			case 3:{
				System.out.println("----- Tankyou! -----");
				loop=false;
				s.close();
				break;
			}
			default:{
				System.out.println("invalid input try again");
				 break;
			}
			}
		}
	}

	private static boolean loginId(String email, String password, ArrayList<register> log) {
		for(register t:log) {
			if(t.password.equals(password)&& t.email.equals(email)) {
				return true;}}
		        return false;}
}
