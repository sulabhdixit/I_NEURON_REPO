package Process;

import java.util.Scanner;

public class Verification {

	public static boolean flag = false;
	Scanner scan = new Scanner(System.in);

	public final String UserId = "Sulabh";
	public String UserPassword = "Password";

	public void verifyUser() {
		System.out.println("For more security you can change your Password, Type :: [Yes/No]");
		String option = scan.next();

		if (option.equalsIgnoreCase("Yes")) {
			System.out.println("Enter your new password");
			UserPassword = scan.next();
			System.out.println("Please enter your User_Name");
			String uid = scan.next();
			System.out.println("Please enter your new Password");
			String upass = scan.next();

			if (UserId.equals(uid) && UserPassword.equals(upass)) {
				System.out.println("THANKS FOR YOUR VERIFICATON ");
				System.out.println("********************************");
				flag = true;

			}
		} else {
			System.out.println("Please enter your User_Name");
			String uid = scan.next();
			System.out.println("Please enter your Password");
			String upass = scan.next();

			if (UserId.equals(uid) && UserPassword.equals(upass)) {
				System.out.println("THANKS FOR YOUR VARIFICATON ");
				System.out.println("********************************");
				flag = true;

			}

		}

	}
}
