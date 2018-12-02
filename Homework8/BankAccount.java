import java.text.NumberFormat;

//Each BankAccount object represents one user's account
//information including name and balance of money

public class BankAccount {
	//Defining the fields and adding the transactionFee 
	String name;
	double balance;
	double transactionFee;
	
	
	//When the client make a deposit, add the value to the current balance
	public void deposit(double amount) {
		balance = balance + amount;
		
	}
	
	//When the client make a withdraw, deduct the transactionFee 
	//If the client's balance is bigger than the withdraw amount plus the transactionFee
	//modify the balance, otherwise cancel the transaction.
	public void withdraw(double amount, double transactionFee) {
		if (amount + transactionFee <= balance) {
			balance = balance - amount - transactionFee;
		}else {
			System.out.println("Transaction not completed due insufficient funds.");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	public double gettransactionFee() {
		return transactionFee;
	}

	public void settransactionFee(double transactionFee) {
		this.transactionFee = transactionFee;
	}
	

	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	//Setting a toString method that will take account name and balance as parameter 
	public String toString(String name, double balance) {
        return (name + ", " + NumberFormat.getCurrencyInstance().format(balance));
    }
	
	//Currency format for the account balance 
	public String getPriceFormatted() 
	{
	    String formattedPrice = NumberFormat.getCurrencyInstance().format(this.balance);
	    return formattedPrice;
	}
	
	
}
