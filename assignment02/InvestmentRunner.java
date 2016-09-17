package assignment02;
/**
   This program computes how long it takes for an investment
   to double.
 */
public class InvestmentRunner {
	public static void main(String[] args) {
		final DollarsAndCents INITIAL_BALANCE = new DollarsAndCents(100000L,0);
		final double RATE = 5;
		Investment invest = new Investment(INITIAL_BALANCE, RATE);
		invest.waitForBalance(INITIAL_BALANCE.upOrDown(2));
		int years = invest.getYears();
		System.out.println("The investment doubled after "
				+ years + " years");
	}   
}