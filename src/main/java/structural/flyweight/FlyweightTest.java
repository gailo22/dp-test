package structural.flyweight;

public class FlyweightTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 // Arbitrary extrinsic state
	      int extrinsicstate = 22;
	 
	      FlyweightFactory factory = new FlyweightFactory();
	 
	      // Work with different flyweight instances
	      Flyweight flyweightX = factory.getFlyweight("X");
	      flyweightX.operation(--extrinsicstate);
	 
	      Flyweight flyweightY = factory.getFlyweight("Y");
	      flyweightY.operation(--extrinsicstate);
	 
	      Flyweight flyweightZ = factory.getFlyweight("Z");
	      flyweightZ.operation(--extrinsicstate);
	 
	      UnsharedConcreteFlyweight unsharedConcreteFlyweight = new UnsharedConcreteFlyweight();
	 
	      unsharedConcreteFlyweight.operation(--extrinsicstate);

	}

}
