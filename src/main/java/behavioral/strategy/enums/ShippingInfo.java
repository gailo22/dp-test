package behavioral.strategy.enums;

public class ShippingInfo {

	private ShippingMethod shippingMethod = ShippingMethod.FIRST_CLASS;
	
	public double getShippingCost() {
		return shippingMethod.getShippingCost();
	}
}
