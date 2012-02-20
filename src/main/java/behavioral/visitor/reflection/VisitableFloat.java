package behavioral.visitor.reflection;

public class VisitableFloat implements Visitable {

	@Override
	public void accept(ReflectiveVisitor visitor) throws Exception {
		visitor.visit(this);
	}

}
