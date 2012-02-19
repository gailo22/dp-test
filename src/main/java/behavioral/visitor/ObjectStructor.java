package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructor {

	private List<Element> elements = new ArrayList<Element>();

	public void attach(Element element) {
		elements.add(element);
	}

	public void detach(Element element) {
		elements.remove(element);
	}

	public void accept(Visitor visitor) {
		for (Element element : elements) {
			element.accept(visitor);
		}
	}
}
