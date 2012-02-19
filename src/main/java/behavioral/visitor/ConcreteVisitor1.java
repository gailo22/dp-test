package behavioral.visitor;

public class ConcreteVisitor1 extends Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println("ConcreteVisitor1.visitConcreteElementA()");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println("ConcreteVisitor1.visitConcreteElementB()");
	}

}
