package creational.prototype;

public class PrototypeTest {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {

		ConcretePrototype1 prototype1 = new ConcretePrototype1("1");
		ConcretePrototype1 prototype1Clone = (ConcretePrototype1) prototype1.clone();
		System.out.println(prototype1Clone.getId());
		
		ConcretePrototype2 prototype2 = new ConcretePrototype2("2");
		ConcretePrototype2 prototype2Clone = (ConcretePrototype2) prototype2.clone();
		System.out.println(prototype2Clone.getId());
		
	}

}
