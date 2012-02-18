package structural.facade;

public class Facade {

	private SubSystemOne subSystemOne;
	private SubSystemTwo subSystemTwo;
	private SubSystemThree subSystemThree;
	private SubSystemFour subSystemFour;
	
	public Facade() {
		subSystemOne = new SubSystemOne();
		subSystemTwo = new SubSystemTwo();
		subSystemThree = new SubSystemThree();
		subSystemFour = new SubSystemFour();
	}
	
	public void methodA() {
		System.out.println("Facade.methodA()");
		subSystemOne.methodOne();
		subSystemTwo.methodTwo();
		subSystemFour.methodFour();
	}
	
	public void methodB() {
		System.out.println("Facade.methodB()");
		subSystemTwo.methodTwo();
		subSystemThree.methodThree();
	}
}
