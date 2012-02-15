package creational.abstractfactory;

public class ConcreteFacroty1 implements AbstractFactory {

	@Override
	public AbstractProductA CreateProductA() {
		return new ProductA();
	}

	@Override
	public AbstractProductB CreateProductB() {
		return new ProductB();
	}

}
