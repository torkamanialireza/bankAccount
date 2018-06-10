
public class BankAccountTest {
	public static void main (String[] args) {
		BankAccount selectAccount = new BankAccount();
		selectAccount.deposit("checking", 200);
		selectAccount.deposit("Savings", 400);
		selectAccount.deposit("Savings", 700);
		selectAccount.getBalances();
		selectAccount.getTotalAccount();
	}
}
