
public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	private static int numberOfAccounts = 0;
	private static double totalAmount = 0;
	private static double totalAccountAmount = 0;
	public BankAccount() {
		numberOfAccounts++;
		this.accountNumber = getAccountNumber();
		
	}
	public String getAccountNumber() {
		String accountNumber = "";
		for(int i = 0; i < 10; i++) {
			int random = (int) (Math.random()*10);
			accountNumber += random;
		}
		return accountNumber;
	}
	private double getCheckingBalance() {
		return this.checkingBalance;
	}
	private double getSavingsBalance() {
		return this.savingsBalance;
	}
	private double getTotalBalance() {
		totalAccountAmount = this.savingsBalance + this.checkingBalance;
		return this.totalAccountAmount;
	}
	
	public void deposit(String accountType, double moneyAmount) {
		
		if (accountType == "checking") {
			this.checkingBalance += moneyAmount;
		} else if(accountType == "Savings") {
			this.savingsBalance += moneyAmount;
		}else {
				System.out.println("Please select to which accout you would like deposite");
			}
		totalAmount += moneyAmount;
		System.out.println("$"+moneyAmount +"deposited to your " + accountType + "account.");
			
		
	}
	public void getBalances() {
		System.out.println("checking : $" + getCheckingBalance());
		System.out.println("Savings : $" + getSavingsBalance());
		
	}
	public void getTotalAccount() {
		System.out.println("Your total  : $" + getTotalBalance());
		
		
	}
	
}
