package behavioral.templatemethod;

public class ConcreteClassB extends AbstractClass {

	@Override
	public void operation1() {
		System.out.println("ConcreteClassB.operation1()");
	}

	@Override
	public void operation2() {
		System.out.println("ConcreteClassA.operation2()");
	}

}
