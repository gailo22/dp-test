package structural.brigde;

public class BrigdeTest {
	public static void main(String[] args) {
		Abstraction abstraction = new RefinedAbstraction();
		
		abstraction.implementor = new ConcreteImplementorA();
		abstraction.operation();

		abstraction.implementor = new ConcreteImplementorB();
		abstraction.operation();
		
	}
}
