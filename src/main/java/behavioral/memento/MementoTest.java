package behavioral.memento;

public class MementoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("On");
		System.out.println("State : " + originator.getState());

		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.createMemento());

		originator.setState("Off");
		System.out.println("State : " + originator.getState());

		originator.setMemento(caretaker.getMemento());
		System.out.println("State : " + originator.getState());
	}

}
