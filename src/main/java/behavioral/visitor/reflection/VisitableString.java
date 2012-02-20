package behavioral.visitor.reflection;

public class VisitableString implements Visitable {

	private String value;

	public VisitableString(String string) {
		value = string;
	}

	@Override
	public void accept(ReflectiveVisitor visitor) throws Exception {
		visitor.visit(this);
	}

}
