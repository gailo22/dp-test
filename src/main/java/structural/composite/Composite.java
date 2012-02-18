package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	private List<Component> children = new ArrayList<Component>();
	
	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		children.add(component);
	}

	@Override
	public void remove(Component component) {
		children.remove(component);
	}

	@Override
	public void display(int depth) {
		StringBuffer dash = new StringBuffer();
		for (int i=0; i < depth;i++) {
			dash.append("-");
		}
		System.out.println(dash.toString() + getName());
		for (Component component : children) {
			component.display(depth + 1);
		}
	}

}
