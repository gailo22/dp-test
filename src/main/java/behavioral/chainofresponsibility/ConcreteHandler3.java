package behavioral.chainofresponsibility;

public class ConcreteHandler3 extends Handler {

	@Override
	public void handleRequest(int request) {
		if (request >= 20 && request < 30) {
			System.out.println("ConcreteHandler3.handleRequest() " + request);
		} else if (getSuccessor() != null) {
			getSuccessor().handleRequest(request);
		}

	}

}
