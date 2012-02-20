package behavioral.visitor.reflection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReflectiveVisitorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Object> elements = new ArrayList<Object>();
		elements.add(new Float(1.0));
		elements.add(new String("abc"));
		elements.add(Arrays.asList("aaa", "bbb", 123));
		
		PrintVisitor printVisitor = new PrintVisitor();
		try {
			printVisitor.visit(elements);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
