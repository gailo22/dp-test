package behavioral.state;

public class StateTest {

	public static void main(String[] args) {
		
		Context context = new Context(new ConcreteStateA());
		
		context.request();
		System.out.println("State : " + context.getState());
		context.request();
		System.out.println("State : " + context.getState());
		context.request();
		System.out.println("State : " + context.getState());
		context.request();
		System.out.println("State : " + context.getState());
		context.request();
		System.out.println("State : " + context.getState());
	}
}
