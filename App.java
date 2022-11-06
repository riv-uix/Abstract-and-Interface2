package bangundatar;

import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		System.out.println("1. Square");
		System.out.println("2. Rectangle");
		System.out.println("3. Triangle");
		System.out.println("4. Isosceles Triangle");
		System.out.println("5. Circle");
		System.out.println("6. Exit");
		System.out.print("Choose: ");
		int choose = input.nextInt();
		switch (choose) {
		case 1:
			System.out.print("Enter side length: ");
			double sideLength = input.nextDouble();
			Square square = new Square(sideLength);
			square.calcArea();
			square.calcPerimeter();
			System.out.println(square.toString());
			break;
		case 2:
			System.out.print("Enter length: ");
			double length = input.nextDouble();
			System.out.print("Enter width: ");
			double width = input.nextDouble();
			Rectangle rectangle = new Rectangle(length, width);
			rectangle.calcArea();
			rectangle.calcPerimeter();
			System.out.println(rectangle.toString());
			break;
		case 3:
			System.out.print("Enter base: ");
			double base = input.nextDouble();
			System.out.print("Enter height: ");
			double height = input.nextDouble();

		case 4:
			System.out.print("Enter base: ");
			double base2 = input.nextDouble();
			System.out.print("Enter height: ");
			double height2 = input.nextDouble();
			IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(base2, height2);
			isoscelesTriangle.calcArea();
			isoscelesTriangle.calcPerimeter();
			System.out.println(isoscelesTriangle.toString());
			break;
		case 5:
			System.out.print("Enter radius: ");
			double radius = input.nextDouble();

		case 6:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
		input.close();
	}
}
