package behavioral.state;

public class ConcreteStateB extends State {

	@Override
	public void hadle(Context context) {
		context.setState(new ConcreteStateA());
	}

}
