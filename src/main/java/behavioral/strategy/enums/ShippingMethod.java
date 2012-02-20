package behavioral.strategy.enums;

public enum ShippingMethod {
	FIRST_CLASS {
		public double getShippingCost() {
			return 0;
		}
	},
	FED_EX {
		public double getShippingCost() {
			return 10;
		}
	},
	UPS {
		public double getShippingCost() {
			return 100;
		}
	};

	public abstract double getShippingCost();
}
