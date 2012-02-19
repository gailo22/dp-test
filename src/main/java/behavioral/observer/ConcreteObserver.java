package behavioral.observer;

public class ConcreteObserver extends Observer {
	
	private String name;
	private String observerState;
	private ConcreteSubject subject;
	
	public ConcreteObserver(ConcreteSubject subject, String name) {
		this.subject = subject;
		this.name = name;
	}

	@Override
	public void update() {
		observerState = subject.getSubjectState();
		System.out.printf("Observer %s's new state is %s\n", name, observerState);
	}

}
