package grocerylist;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList 
{
	public static void main(String args[])
	{
		int choice,qty;
		float budget,price,totalprice;
		String name;
		System.out.println("Enter your budget");
		Scanner s = new Scanner(System.in);
		budget = s.nextFloat();
		ArrayList<Product> GList = new ArrayList<Product>();
		do
		{
			System.out.println("1.Add an item");
			System.out.println("2.Exit");
			System.out.println("Enter your choice");
			Scanner s1 = new Scanner(System.in);
			choice = s1.nextInt();
			if (choice==1)
			{
				System.out.println("Enter product name:");
				Scanner s2 = new Scanner(System.in);
				name = s2.nextLine();
				System.out.println("Enter product quantity:");
				Scanner s3 = new Scanner(System.in);
				qty = s3.nextInt();
				System.out.println("Enter product price:");
				Scanner s4 = new Scanner(System.in);
				price = s4.nextFloat();
				Product p = new Product(name, qty, price);
				if(GList.contains(p))
				{
					for(Product product: GList)
					{
						if(product.getName().equals(name))
								{
									product.setQuantity(qty);
									product.setPrice(price);
									GList.add(product);
									totalprice= product.getQuantity()*product.getPrice();
									budget-=totalprice;
								}
					}			
				}
				else
				{
					GList.add(p);
					totalprice= p.getQuantity()*p.getPrice();
					budget-=totalprice;
				}
				if(budget<0)
				{
					System.out.println("Sorry cannot proceed as the price exceeds the budget");
				}
				else
				{
					System.out.println("Remaining Budget: " +budget);
				}
			}
		}while(choice != 2);
	}

}
