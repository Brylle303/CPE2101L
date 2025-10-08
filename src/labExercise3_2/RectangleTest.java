package labExercise3_2;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle firstRectangle = new Rectangle(4, 40);
		Rectangle secondRectangle = new Rectangle(3.5, 35.9);
		
		System.out.println("Rectangle 1\nWidth: " + firstRectangle.width);
		System.out.println("Height: " + firstRectangle.height);
		System.out.println("Area: " + firstRectangle.getArea());
		System.out.println("Perimeter: " + firstRectangle.getPerimeter());
		
		System.out.println("\nRectangle 2\nWidth: " + secondRectangle.width);
		System.out.println("Height: " + secondRectangle.height);
		System.out.println("Area: " + secondRectangle.getArea());
		System.out.println("Perimeter: " + secondRectangle.getPerimeter());
		
		
		
	}

}
