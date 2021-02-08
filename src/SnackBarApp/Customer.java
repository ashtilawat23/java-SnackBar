package SnackBarApp;

public class Customer
{
	private static int maxId = 1001;

	private int id;
	private String name;
	private double cashOnHand;

	public Customer(String name, double cashOnHand)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.cashOnHand = cashOnHand;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getCashOnHand()
	{
		return cashOnHand;
	}

	public void buySnacks(Snack snack, int numToBuy)
	{
		this.cashOnHand = cashOnHand - (snack.getCost()*numToBuy);
	}

	public void addCashOnHand(double cash)
	{
		this.cashOnHand += cash; 
	}
}