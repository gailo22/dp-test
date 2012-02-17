package creational.builder;

public class ConcreteBuilder2 extends Builder {

	private Product product = new Product();
	
	@Override
	public void buildPartA() {
		product.addPart("Part X");
	}

	@Override
	public void buildPartB() {
		product.addPart("Part Y");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
