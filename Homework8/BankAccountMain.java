

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		
		//Client's first deposit 
		account1.deposit(500);
		
		//Show balance
		System.out.println(account1.getPriceFormatted());
		
		//withdraw of $100 with a transactionFee of $25
		account1.withdraw(100, 25);
		
		//Show balance
		System.out.println(account1.getPriceFormatted());
		
		//Client makes a new deposite
		account1.deposit(300);
		
		//Show balance
		System.out.println(account1.getPriceFormatted());
		
		//Client tries to withdraw a value bigger than the current account balance
		account1.withdraw(850, 85);
		
		//Show balance
		System.out.println(account1.getPriceFormatted());
		
		
		System.out.println();
		
		
		//Calling a toString method - display account name and current balance
		System.out.println(account1.toString("Yana", 3.03));
		System.out.println(account1.toString("Camila", 10006790));
		
		

	}



}
