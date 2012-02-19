package behavioral.visitor;

public class ConcreteElementB extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
	}
	
	public void operationB() {
		System.out.println("ConcreteElementB.operationB()");
	}

}
