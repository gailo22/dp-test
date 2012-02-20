package behavioral.visitor.reflection;

public interface Visitable {

	void accept(ReflectiveVisitor visitor) throws Exception;

}
