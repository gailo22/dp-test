package behavioral.chainofresponsibility;

public class ConcreteHandler1 extends Handler {

	@Override
	public void handleRequest(int request) {
		if (request >= 0 && request < 10) {
			System.out.println("ConcreteHandler1.handleRequest() " + request);
		} else if (getSuccessor() != null) {
			getSuccessor().handleRequest(request);
		}
	}

}
