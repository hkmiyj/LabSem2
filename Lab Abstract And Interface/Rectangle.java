public class Rectangle extends GeometricObject implements Colorable {
	private double length;
	private double width;

	public Rectangle() {
		this(0, 0);
	}

	public Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
	}

	public void setWidth(double w) {
		this.width = w;
	}

	public double getSide() {
		return this.width;
	}

	public void setLength(double l) {
		this.length = l;
	}

	public double getLength() {
		return this.length;
	}

	public double getArea() {

		return width * length;
	}

	public double getPerimeter() {

		return (2 * width) + (2 * length);
	}
	
	public String getTypeShape() {
		return "Rectangle";
	}

	public void howToColor() {
		System.out.print("Color all four sides\n");
	}

}
