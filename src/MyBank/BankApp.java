package MyBank;

import java.util.InputMismatchException;
import java.util.Scanner;

import Process.CheckBalance;
import Process.DepositAmount;
import Process.Transaction;
import Process.Withdraw;
import Process.Verification;
/*
 * @author Sulabh Dixit
 * Company INeuron
 */

class MiniBank {
	public static int Bank() {

		try {
			int amount = 90000;
			System.out.println("*** Welcome to INEURON Bank ***\n");
			Scanner sc = new Scanner(System.in);
			Verification v = new Verification();
			v.verifyUser();

			if (Verification.flag == true) {
				while (true) {
					try {
						System.out.println("Please choose your option :: ");
						Thread.sleep(1000);
						System.out.print("1.Balance Check\n" + "2.Deposit\n" + "3.Withdraw\n" + "4.Send Money\n"
								+ "5.Exit\n" + "Enter your choice :");
						int x = sc.nextInt();

						if (x == 1) {
							amount = CheckBalance.Check(amount);
							continue;
						} else if (x == 2) {
							amount = DepositAmount.Deposit(amount);
							continue;
						} else if (x == 3) {
							amount = Withdraw.withdraw(amount);
							continue;
						} else if (x == 4) {
							amount = Transaction.Send(amount);
							continue;
						} else if (x == 5) {
							System.out.println("Are you sure :: [Yes/No]");
							String option = sc.next();
							if (option.equalsIgnoreCase("Yes")) {
								System.out.println("Thank you for visting our bank ");
								System.exit(0);
							} else {
								continue;
							}
						}

						sc.close();
					} catch (InputMismatchException ime) {

						System.out.println("Use degit only");
					}

				}
			} else {
				return 1;
			}

		} catch (InterruptedException IE) {
			IE.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;

	}
}

public class BankApp {

	public static void main(String[] args) {

		MiniBank b = new MiniBank();

		if (b.Bank() == 1) {
			System.out.println("Please Enter Valid Login Details");
			b.Bank();
		}

		else if (b.Bank() == 0) {
			System.out.println("Please Choose Correct Option From Above List");
			System.exit(0);
		}

	}
}
