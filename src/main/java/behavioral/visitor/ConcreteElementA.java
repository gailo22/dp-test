package behavioral.visitor;

public class ConcreteElementA extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}
	
	public void operationA() {
		System.out.println("ConcreteElementA.operationA()");
	}

}
