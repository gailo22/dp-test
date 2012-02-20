package behavioral.visitor.reflection;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;

public class PrintVisitor implements ReflectiveVisitor {

	@Override
	public void visit(Object object) throws Exception {
		Method visitMethod = getMethod(getClass(), object.getClass());
		visitMethod.invoke(this, new Object[] { object });
	}

	private Method getMethod(Class<? extends PrintVisitor> class1,
			Class<? extends Object> class2) {
		// get method start with visit
		return null;
	}

	public void visitCollection(Collection collection) throws Exception {
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			Object o = iterator.next();
			if (o instanceof Visitable) {
				((Visitable) o).accept(this);
			}
		}
	}

	public void visitString(String string) {
		System.out.println("'" + string + "'");
	}

	public void visitFloat(Float f) {
		System.out.println(f.toString() + "f");
	}

	public void visitDefault(Object o) {
		System.out.println(o.toString());
	}

}
