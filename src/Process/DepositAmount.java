package Process;

import java.util.Scanner;

public class DepositAmount {

	public static int Deposit(int amount) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Please Enter the amount to Deposit Rs.");
			int deposit = sc.nextInt();
			amount += deposit;
			Thread.sleep(4000);
			System.out.println("Rs." + deposit + " is deposited into your Account");
			System.out.println("Current Available Balance is Rs." + amount);
		} catch (Exception e) {
			System.out.println("Enter vaild amount");
		}
		return amount;
	}
}
