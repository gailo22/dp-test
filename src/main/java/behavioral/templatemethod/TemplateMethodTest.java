package behavioral.templatemethod;

public class TemplateMethodTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AbstractClass classA = new ConcreteClassA();
		classA.templateMethod();

		AbstractClass classB = new ConcreteClassB();
		classB.templateMethod();
	}

}
