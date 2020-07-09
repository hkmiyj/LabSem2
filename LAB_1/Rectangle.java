public class Rectangle 
{
	public static void main(String[]args) 
	{
		
		//construct a object of first Rectangle 
		newRectangle firstRectangle = new newRectangle(4,40); //width= 4 height= 40
		System.out.println("First Rectangle");
		System.out.println("Height = "+  firstRectangle.height);
		System.out.println("Width = "+  firstRectangle.width);
		System.out.println("Area = "+  firstRectangle.getArea());
		System.out.println("Perimeter = "+  firstRectangle.getPerimeter()+"\n");
		
		//construct a object of second Rectangle
		newRectangle secondRectangle = new newRectangle(3.5,35.9); //width=3.5 height=35.9
		System.out.println("Second Rectangle");
		System.out.println("Height = "+  secondRectangle.height);
		System.out.println("Width = "+  secondRectangle.width);
		System.out.println("Area = "+  secondRectangle.getArea());
		System.out.println("Perimeter = "+  secondRectangle.getPerimeter());
	}
}
//create a class named newRectangle
class newRectangle 
{
	//Data field for class newRectangle
	double width=1;
	double height=1;
	
	//constructor
	newRectangle() 
	{
	}
	
	//constructor with specified argument
	public newRectangle(double newWidth,double newHeight) 
	{
		width = newWidth;
		height = newHeight;
	}
	
	//return the area of the rectangle
	double getArea() 
	{
		return width*height;
	}
	
	//return the perimeter of the rectangle
	double getPerimeter() 
	{
		return 2*(width+height);
	}
}