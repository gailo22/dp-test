package behavioral.chainofresponsibility;

public class ConcreteHandler2 extends Handler {

	@Override
	public void handleRequest(int request) {
		if (request >= 10 && request < 20) {
			System.out.println("ConcreteHandler2.handleRequest() " + request);
		} else if (getSuccessor() != null) {
			getSuccessor().handleRequest(request);
		}

	}

}
