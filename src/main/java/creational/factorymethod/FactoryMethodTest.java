package creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class FactoryMethodTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Creator> creators = new ArrayList<Creator>();
		creators.add(new ConcreteCreatorA());
		creators.add(new ConcreteCreatorB());
		
		for (Creator creator : creators) {
			Product product = creator.factoryMethod();
			product.printProductName();
		}

	}

}
