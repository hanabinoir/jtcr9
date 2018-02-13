package jtcr9.box;

public class BoxWeight extends Box {

	private double weight;
	
	public BoxWeight(double width, double height, double depth, double weight) {
		super(width, height, depth);
		this.weight = weight;
	}

	public BoxWeight() {
		super();
		this.weight = -1;
	}

	public BoxWeight(double len, double weight) {
		super(len);
		this.weight = weight;
	}

	public BoxWeight(BoxWeight boxWeight) {
		super(boxWeight);
		this.weight = boxWeight.weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
