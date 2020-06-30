public class Square extends GeometricObject implements Colorable {
	private double side;

	public Square() {
		this(0);
	}

	public Square(double side) {
		this.side = side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getSide() {
		return this.side;
	}

	public double getArea() {

		return side * side;
	}

	public double getPerimeter() {

		return side * 4;
	}
	
	public String getTypeShape() {
		return "Square";
	}

	public void howToColor() {
		System.out.print("Color all four sides\n");

	}

}
