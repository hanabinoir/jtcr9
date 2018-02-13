package jtcr9.box;

public class Shipment extends BoxWeight {

	private double cost;
	
	public Shipment(double width, double height, double depth, 
			double weight, double cost) {
		super(width, height, depth, weight);
	}

	public Shipment() {
		super();
		this.cost = -1;
	}

	public Shipment(double len, double weight, double cost) {
		super(len, weight);
		this.cost = cost;
	}

	public Shipment(Shipment shipment) {
		super(shipment);
		this.cost = shipment.cost;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}
