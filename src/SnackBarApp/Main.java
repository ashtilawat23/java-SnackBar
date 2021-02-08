package SnackBarApp;

public class Main
{
	private static void workWithData()
	{
		VendingMachine v_food = new VendingMachine("Food");
		VendingMachine v_drinks = new VendingMachine("Drinks");

		Snack s_pretzel = new Snack("Pretzel", 38, 2.00, v_food.getId());
		Snack s_chocolatebar = new Snack("Chocolate Bar", 35, 1.00, v_food.getId());
		Snack s_chips = new Snack("Chips", 36, 1.75, v_food.getId());
		Snack s_soda = new Snack("Soda", 19, 2.50, v_drinks.getId());
		Snack s_water = new Snack("Water", 20, 2.75, v_drinks.getId());

		Customer c_jane = new Customer("Jane", 37.75);
		Customer c_bob = new Customer("Bob", 28.14);

		System.out.println(c_jane.getName()+" cash on hand $"+c_jane.getCashOnHand());
		s_soda.addQuantity(2);
		System.out.println("Quantity of "+s_soda.getName()+" is "+s_soda.getQuantity());
		System.out.println();
		c_jane.buySnacks(s_pretzel, 1);
		System.out.println(c_jane.getName()+" cash on hand $"+c_jane.getCashOnHand());
		s_pretzel.buySnacks(9);
		System.out.println("Quantity of "+s_pretzel.getName()+" is "+s_pretzel.getQuantity());
		System.out.println();
		System.out.println(c_bob.getName()+" cash on hand $"+c_bob.getCashOnHand());
		s_soda.buySnacks(2);
		System.out.println("Quantity of "+s_soda.getName()+" is "+s_soda.getQuantity());
		System.out.println();
		c_jane.addCashOnHand(10);
		System.out.println(c_jane.getName()+" cash on hand $"+c_jane.getCashOnHand());
		System.out.println();
		c_jane.buySnacks(s_chocolatebar, 1);
		System.out.println(c_jane.getName()+" cash on hand $"+c_jane.getCashOnHand());
		System.out.println("Quantity of "+s_chocolatebar.getName()+" is "+s_chocolatebar.getQuantity());
		System.out.println();
		s_pretzel.addQuantity(12);
		System.out.println("Quantity of "+s_pretzel.getName()+" is "+s_pretzel.getQuantity());
		System.out.println();
		c_bob.buySnacks(s_pretzel, 3);
		s_pretzel.buySnacks(3);
		System.out.println(c_bob.getName()+" cash on hand $"+c_bob.getCashOnHand());
		System.out.println("Quantity of "+s_pretzel.getName()+" is "+s_pretzel.getQuantity());
		System.out.println();
		System.out.println("Stretch Goals");
		System.out.println();
		System.out.println("Snacks: "+s_chips.getName());
		System.out.println("Vending Machine: "+v_food.getName());
		System.out.println("Quantity: "+s_chips.getQuantity());
		System.out.println("Total Cost: $"+s_chips.getTotalCost());
		System.out.println();
		System.out.println("Snacks: "+s_chocolatebar.getName());
		System.out.println("Vending Machine: "+v_food.getName());
		System.out.println("Quantity: "+s_chocolatebar.getQuantity());
		System.out.println("Total Cost: $"+s_chocolatebar.getTotalCost());
		System.out.println();
		System.out.println("Snacks: "+s_pretzel.getName());
		System.out.println("Vending Machine: "+v_food.getName());
		System.out.println("Quantity: "+s_pretzel.getQuantity());
		System.out.println("Total Cost: $"+s_pretzel.getTotalCost());
		System.out.println();
		System.out.println("Snacks: "+s_soda.getName());
		System.out.println("Vending Machine: "+v_drinks.getName());
		System.out.println("Quantity: "+s_soda.getQuantity());
		System.out.println("Total Cost: $"+s_soda.getTotalCost());
		System.out.println();
		System.out.println("Snacks: "+s_water.getName());
		System.out.println("Vending Machine: "+v_drinks.getName());
		System.out.println("Quantity: "+s_water.getQuantity());
		System.out.println("Total Cost: $"+s_water.getTotalCost());
		System.out.println();
	}

	public static void main(String[] args)
	{
		workWithData();
	}
}