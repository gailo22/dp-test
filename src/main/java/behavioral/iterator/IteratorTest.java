package behavioral.iterator;

public class IteratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcreteAggregate aggregate = new ConcreteAggregate();
		aggregate.getItems().add("Item A");
		aggregate.getItems().add("Item B");
		aggregate.getItems().add("Item C");
		aggregate.getItems().add("Item D");

		ConcreteIterator iterator = new ConcreteIterator(aggregate);

		Object item = iterator.first();
		while (item != null) {
			System.out.println(item);
			item = iterator.next();
		}
	}
}
