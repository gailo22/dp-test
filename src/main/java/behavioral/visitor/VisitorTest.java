package behavioral.visitor;

public class VisitorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ObjectStructor objectStructor = new ObjectStructor();
		objectStructor.attach(new ConcreteElementA());
		objectStructor.attach(new ConcreteElementB());
		
		ConcreteVisitor1 visitor1 = new ConcreteVisitor1();
		ConcreteVisitor2 visitor2 = new ConcreteVisitor2();
		
		objectStructor.accept(visitor1);
		objectStructor.accept(visitor2);
	}

}
