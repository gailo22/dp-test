package behavioral.observer;

public class ObserverTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		subject.attach(new ConcreteObserver(subject, "X"));
		subject.attach(new ConcreteObserver(subject, "Y"));
		subject.attach(new ConcreteObserver(subject, "Z"));
		
		subject.setSubjectState("ABC");
		subject.notifyObservers();
	}

}
