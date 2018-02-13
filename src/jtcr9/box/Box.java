package jtcr9.box;

public class Box {

	private double width, height, depth;

	public Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public Box() {
		this.width = this.height = this.depth = -1;
	}
	
	public Box(double len) {
		this.width = this.height = this.depth = len;
	}
	
	public Box(Box box) {
		this.width = box.width;
		this.height = box.height;
		this.depth = box.depth;
	}
	
	public double volume() {
		return this.width * this.height * this.depth;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}
}
