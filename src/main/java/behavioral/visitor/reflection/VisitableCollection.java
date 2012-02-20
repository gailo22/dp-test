package behavioral.visitor.reflection;

public class VisitableCollection implements Visitable {

	@Override
	public void accept(ReflectiveVisitor visitor) throws Exception {
		visitor.visit(this);
	}

}
