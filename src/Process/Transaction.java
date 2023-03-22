package Process;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Transaction {

	public static int Send(int amount) {
		try {
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.print("Enter the Money to send INR.");
				int send = sc.nextInt();

				if (send < amount) {
					System.out.println("Select the option for sending Money" + "\n 1.Mobile Number" + "\n 2.UPI ID"
							+ "\n 3.Bank Account");
					int x = sc.nextInt();

					if (x == 1) {
						try {
							System.out.println("Please Enter the mobile Number");
							Long num = sc.nextLong();
							if (num < 10000000000d && num > 999999999d) {
								amount -= send;
								System.out.println("Rs." + send + " is send to mobie number " + num);
								System.out.println("Loading...");
								Thread.sleep(1000);
								System.out.println("Current Available Balance is Rs." + amount);
							}

							else {
								System.out.println("Entered Mobile no. is not valid Please Try again");
								continue;
							}
						} catch (InputMismatchException e) {
							System.out.println("Enter Degits only");
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						break;
					}

					else if (x == 2) {

						System.out.println("Please Enter the UPI ID");
						String id = sc.next();
						if (id.indexOf("@") > 0) {
							amount -= send;
							System.out.println("Rs." + send + " is send to UPI ID " + id);
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println("Current Available Balance is Rs." + amount);
						} else {
							System.out.println("Entered UPI ID is not valid Please Try again");
							continue;
						}
						break;
					} else if (x == 3) {
						System.out.print("Please Enter the Account Holder's Name:");
						String name = sc.next();
						System.out.print("Please Enter the Account Number:");
						String acc = sc.next();
						System.out.print("Please Enter the IFSC Code:");
						String code = sc.next();
						amount -= send;
						System.out.printf("Rs.%d is send to %s.\nAccount Number:%s\nIFSC Code:%s \n", send, name, acc,
								code);
						// Thread.sleep(1000);
						System.out.println("Current Available Balance is Rs." + amount + "\n");
						break;
					} else {
						System.out.println("Invalid input Please try again");

					}
				} else {
					System.out.println("Low Balance");
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Input mismatch");

		}
		return amount;
	}
}