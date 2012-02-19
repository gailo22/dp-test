package behavioral.visitor;

public class ConcreteVisitor2 extends Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println("ConcreteVisitor2.visitConcreteElementA()");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println("ConcreteVisitor2.visitConcreteElementB()");
	}

}
