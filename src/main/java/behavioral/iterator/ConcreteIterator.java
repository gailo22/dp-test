package behavioral.iterator;

public class ConcreteIterator extends Iterator {

	private ConcreteAggregate aggregate;
	private int current = 0;

	public ConcreteIterator(ConcreteAggregate concreteAggregate) {
		this.aggregate = concreteAggregate;
	}

	@Override
	public Object first() {
		return aggregate.getItems().get(0);
	}

	@Override
	public Object next() {
		Object returnItem = null;
		if (current < aggregate.count() - 1) {
			returnItem = aggregate.getItems().get(++current);
		}
		return returnItem;
	}

	@Override
	public boolean isDone() {
		return current >= aggregate.count();
	}

	@Override
	public Object currentItem() {
		return aggregate.getItems().get(current);
	}

}
