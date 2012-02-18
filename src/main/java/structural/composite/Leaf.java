package structural.composite;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		System.out.println("Cannot add to Leaf");
	}

	@Override
	public void remove(Component component) {
		System.out.println("Cannot remove Leaf");
	}

	@Override
	public void display(int depth) {
		StringBuffer dash = new StringBuffer();
		for (int i=0; i < depth;i++) {
			dash.append("-");
		}
		System.out.println(dash.toString()+getName());
	}

}
