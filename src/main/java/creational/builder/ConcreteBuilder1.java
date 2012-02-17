package creational.builder;

public class ConcreteBuilder1 extends Builder {

	private Product product = new Product();
	
	@Override
	public void buildPartA() {
		product.addPart("Part A");
	}

	@Override
	public void buildPartB() {
		product.addPart("Part B");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
