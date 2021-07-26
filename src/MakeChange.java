import java.util.Scanner;
public class MakeChange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the price of the item:");
		double price = input.nextDouble();
		System.out.println("Please enter the value tendered:");
		double payment = input.nextDouble();
		double change = 0.0;
		int twenties = 0, tens = 0, fives = 0, ones = 0, quarters = 0, dimes = 0, nickles = 0, pennies = 0;
		
		if(price > payment) {
			System.out.println("Please enter enough money for the purchase.");
		}
		else if(price == payment) {
			System.out.println("You provided exact tender for this item and will not receive any change, goodbye.");
		}
		else {
			change = payment - price;
			System.out.print("Amount: " + price + " Tendered: " + payment + " Result ");
		}
		
//		$20 check
		if(change >=20.00) {
			twenties = (int)(change/ 20.00);
			change = (change - (twenties * 20.00));
		}
//		$10 check
		if(change >= 10.00) {
			tens = (int)(change/ 10.00);
			change = (change - (tens * 10.00));
		}
//		$5 check
		if(change >= 5.00) {
			fives = (int)(change/ 5.00);
			change = (change - (fives * 5.00));
		}
//		$1 check
		if(change >= 1.00) {
			ones = (int)(change/ 1.00);
			change = (change - (ones * 1.00));
		}
//		$0.25 check
		if(change >= 0.25) {
			quarters = (int)(change/ 0.25);
			change = (change - (quarters * 0.25));
		}
//		$0.10 check
		if(change >= 0.10) {
			dimes = (int)(change/ 0.10);
			change = (change - (dimes * 0.10));
		}
//		$0.05 check
		if(change >= 0.05) {
			nickles = (int)(change/ 0.05);
			change = (change - (nickles * 0.05));
		}
//		$0.01 check
		if(change >= 0.01) {
			pennies = (int)Math.round(change/ 0.01);
			change = (change - (pennies * 0.01));
		}
		
		if(twenties > 0) {
			System.out.print(twenties + " Twenty ");
		}
		if(tens > 0) {
			System.out.print(tens + "ten");
		}
		if(fives > 0) {
			System.out.print(fives + " five ");
		}
		if(ones > 0) {
			if(ones > 1) {
				System.out.print(ones + " ones ");
			}
			else 
				System.out.print(ones + " one ");
		}
		if(quarters > 0) {
			if(quarters > 1) {
				System.out.print(quarters + " quarters ");
			}
			else System.out.print(quarters + " quarter ");
		}
		if(dimes > 0) {
			if(dimes > 1) {
				System.out.print(dimes + " dimes ");
			}
			else
				System.out.print(dimes + " dime ");
		}
		if(nickles > 0) {
			if(nickles > 1) {
				System.out.print(nickles + " nickles ");
			}
			else
				System.out.print(nickles + " nickle ");
		}
		if(pennies > 0) {
			if(pennies > 1) {
				System.out.print(pennies + " pennies ");
			}
			else
				System.out.print(pennies + " penny ");
		}
		input.close();
	}
}


