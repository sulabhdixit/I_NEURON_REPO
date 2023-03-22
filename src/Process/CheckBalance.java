package Process;

public class CheckBalance {
	public static int Check(int amount) throws Exception {
		Thread.sleep(2000);
		System.out.println("Your Current Account Balance is Rs." + amount);
		Thread.sleep(2000);
		return amount;
	}

}
