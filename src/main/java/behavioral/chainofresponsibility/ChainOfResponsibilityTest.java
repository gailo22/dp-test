package behavioral.chainofresponsibility;

public class ChainOfResponsibilityTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();
		handler1.setSuccessor(handler2);
		handler2.setSuccessor(handler3);

		// Generate and process request
		int[] requests = { 2, 5, 14, 22, 18, 3, 27, 20 };

		for (int request : requests) {
			handler1.handleRequest(request);
		}
	}

}
