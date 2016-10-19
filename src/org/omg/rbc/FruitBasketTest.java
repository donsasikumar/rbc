package org.omg.rbc;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.omg.rbc.FruitBasket.Fruit;

public class FruitBasketTest {
	@Test
	public void test_isValidBasket(){
		Set<Fruit> fruits = new HashSet<>(5);
		fruits.add(Fruit.Bananas);
		fruits.add(Fruit.Oranges);
		fruits.add(Fruit.Apples);
		fruits.add(Fruit.Lemons);
		fruits.add(Fruit.Peaches);
		Assert.assertTrue(FruitBasket.isValidBasket(fruits));
		fruits.remove(Fruit.Bananas);
		Assert.assertFalse(FruitBasket.isValidBasket(fruits));
	}
	
	
	@Test
	public void test() {
		Set<Fruit> fruits = new HashSet<>(5);
		fruits.add(Fruit.Bananas);
		fruits.add(Fruit.Oranges);
		fruits.add(Fruit.Apples);
		fruits.add(Fruit.Lemons);
		fruits.add(Fruit.Peaches);
		if (FruitBasket.isValidBasket(fruits)){
			Assert.assertNotNull(FruitBasket.calculateTotalOf(fruits));
		}

	}

}
