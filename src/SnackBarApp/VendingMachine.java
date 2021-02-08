package SnackBarApp;

public class VendingMachine
{
	public static int maxId = 1001;

	private int id;
	private String name;

	public VendingMachine(String name)
	{
		maxId++;
		id = maxId;

		this.name = name;
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
}