package Process;

import java.util.Scanner;

public class Withdraw {

	public static int withdraw(int amount) throws Exception {

		System.out.print("Enter the Amount you want to withdraw Rs.");
		Scanner sc = new Scanner(System.in);
		int withdraw = sc.nextInt();
		if (withdraw < amount) {
			amount = amount - withdraw;
			System.out.println("Rs." + withdraw + " is withdraw from your Account");
			Thread.sleep(1000);
			System.out.println("Current Available Balance is Rs." + amount);
			return amount;
		} else {
			System.out.println("insufficient Balance");
			Thread.sleep(1000);
			System.out.println("Current Available Balance is Rs." + amount);
			return amount;
		}
	}
}