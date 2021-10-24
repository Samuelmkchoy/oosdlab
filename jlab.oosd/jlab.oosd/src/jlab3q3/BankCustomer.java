package jlab3q3;

public class BankCustomer 
{
	private String name;
	private String address;
	
	public BankCustomer()
	{
		setName("");
		setAddress("");
	}
	public void setName(String n)
	{
		name = n;
	}
	
	public void setAddress(String ad)
	{
		address = ad;
	}
	public String getName()
	{
		return name;
	}

	public String getAddress()
	{
		return address;
	}
	
	public void addAccount() //I am not really sure ->>
	{
		SavingsAccount ac1 = new SavingsAccount();
		SavingsAccount ac2 = new SavingsAccount();
		SavingsAccount ac3 = new SavingsAccount();
		
		SavingsAccount.modifyAnnualInterestRate(0.04f);

		ac1.setSavingsBlance(2000.00f);
		ac2.setSavingsBlance(3000.00f);
		ac3.setSavingsBlance(4000.00f);
		
		ac1.calculateMonthlyInterest();
		ac2.calculateMonthlyInterest();
		ac3.calculateMonthlyInterest();
		
		
	}	
}
