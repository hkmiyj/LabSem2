public class TestShape {
	public static void main(String[] args) {
		
		//Create five shape obbject
		GeometricObject[] shapes = new GeometricObject[5];
		shapes[0] = new Circle(3);
		shapes[1] = new Rectangle(9, 15);
		shapes[2] = new Square(3);
		shapes[3] = new Rectangle(10, 7);
		shapes[4] = new Circle(3);
		
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("Type Shape \t    : " + shapes[i].getTypeShape());
			System.out.printf("Area Shape " + i + "\t    : %.2f \n", shapes[i].getArea());
			System.out.print("Procedure To Colour : ");
			if (shapes[i] instanceof Colorable) {
				((Colorable) shapes[i]).howToColor();
			} else
				System.out.println("None");
			System.out.println();
		}
	}
}