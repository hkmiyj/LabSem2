public class Circle extends GeometricObject {
	private double radius;

	public Circle() {
		this(0);
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public void setSide(double radius) {
		this.radius = radius;
	}

	public double getSide() {
		return this.radius;
	}

	public double getArea() {

		return (radius * radius) * Math.PI;
	}
	
	public String getTypeShape() {
		return "Circle";
	}

	public double getPerimeter() {

		return 2 * Math.PI * radius;
	}

}
