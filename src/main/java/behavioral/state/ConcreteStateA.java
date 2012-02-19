package behavioral.state;

public class ConcreteStateA extends State {

	@Override
	public void hadle(Context context) {
		context.setState(new ConcreteStateB());
	}

}
