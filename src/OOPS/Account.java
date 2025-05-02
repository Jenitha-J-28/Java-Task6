package OOPS;

public class Account {
int AccountNumber;
String AccountName;
double Balance;
public Account(int AccountNumber,String AccountName,double Balance) {
	this.AccountNumber = AccountNumber;
	this.AccountName = AccountName;
	this.Balance = Balance;
}
public int getAccountNumber() {
	return AccountNumber;
}
public String getAccountName() {
	return AccountName;
}
public double getBalance() {
	return Balance;
}
public void deposit(double amount) {
	if(amount>0) {
		this.Balance +=amount;
		System.out.println("Amount" + amount +" deposited successfully");
	}else {
		System.out.println("Amount not deposited, Check the error");
	}
}
public void withDraw(double amount) {
	if(amount>0 && amount<=this.Balance) {
		this.Balance -=amount;
		System.out.println("The amount " + amount + " Withdrawn Successfully");
	}else {
		System.out.println("Invalid Transaction");
	}
}
public void Balance() {
	System.out.println("Your Current Balance is : " + this.Balance);
}
public String toString() {
	return "Account :{" + "Account Number = " + AccountNumber + ", Account Name = " + AccountName + ", Balance = " + Balance + '}';
	
}
	public static void main(String[] args) {
		Account account1 = new Account(56754433,"Jenitha",50000);
		System.out.println(account1);
		account1.getAccountNumber();
		account1.getAccountName();
		account1.getBalance();
		account1.deposit(10000);
		account1.withDraw(5000);
		account1.Balance();
	}
}
