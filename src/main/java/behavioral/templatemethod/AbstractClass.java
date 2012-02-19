package behavioral.templatemethod;

public abstract class AbstractClass {

	public abstract void operation1();

	public abstract void operation2();

	public void templateMethod() {
		operation1();
		operationTemplate();
		operation2();
		System.out.println("-----");
	}

	private void operationTemplate() {
		System.out.println("AbstractClass.operationTemplate()");

	}
}
