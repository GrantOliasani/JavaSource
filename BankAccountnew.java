public class BankAccountnew

{
  private double balance;
  public  BankAccountnew()
	{
		balance=0;
	}
public BankAccountnew(double initialBalance)
	{
		balance=initialBalance;
	}
public void deposit (double amount)
	{
		balance=balance+amount;
	}
public void withdraw (double amount)
	{
		balance=balance - amount;

	}
public void interest (double rate)
	{
		balance= balance + (balance*rate);
	}
public double getBalance()
	{
		return balance;
	}
}