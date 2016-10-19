package org.omg.rbc;

import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;

class FruitBasket {

	enum Fruit {
		Bananas(1), Oranges(2), Apples(3), Lemons(4), Peaches(5);
		Fruit(int price) {
			this.price = price;
		}
		private final int price;

		public int getPrice() {
			return price;
		}
	}

	private static Scanner userInput;
	private static final Logger LOGGER = Logger.getLogger("FruitBasket.class");

	/*
	 * Accepts the Quantity for a given fruit. 
	 * Returns the Quantity entered by  the User.
	 */
	static int getQuantityOf(Fruit fruit) {
		System.out.println("Please enter number of " + fruit + " (1 or more): ");
		userInput = new Scanner(System.in);
		return userInput.hasNextInt() ? userInput.nextInt()	: getQuantityOf(fruit);
	}

	/**
	 * Calculates the total price of fruits in the Set.
	 * If Quantity of any fruit is Zero, then default value of 1 is used.
	 * @param Set of Fruits
	 * @return Total price of the Set
	 */
	static int calculateTotalOf(Set<Fruit> basket) {
		int totalPrice = 0;
		int Qty = 0;
		for (Fruit fruit : basket) {
			Qty = getQuantityOf(fruit);
			Qty = Qty <= 0 ? 1 : Qty;
			totalPrice = totalPrice + (fruit.price * Qty);
		}
		System.out.println("Total Price = " + totalPrice);
		return totalPrice;
	}

	/**
	 * 
	 * @param Set of Fruits
	 * @return True if Basket is valid, false if it is invalid
	 */
	public static boolean isValidBasket(Set<Fruit> basket) {
		if (basket.isEmpty()) {
			LOGGER.info("Empty Basket");
			return false;
		}
		if (basket.size() != 5) {
			LOGGER.info("Basket should contain 5 items");
			return false;
		}
		return true;
	}


}
