package Week8_1;

import java.util.Scanner;

public abstract class ShapeMystery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose number of shape: square (1), rhombus (2), circle (3) or triangle (4). ");
        System.out.print("Please enter the number of which shape you want: ");
        int shape = scan.nextInt();
        Shape mysteryShape = resultFigure(shape);
        assert mysteryShape != null;
        System.out.println("Area of chosen shape is " + mysteryShape.getArea());
        System.out.println("Perimeter of chosen shape is " + mysteryShape.getPerimeter());
    }

    public static Shape resultFigure(int shape) {
        Scanner scan = new Scanner(System.in);

        if (shape == 1) {
            System.out.print("Please enter the dimension of side: ");
            int side = scan.nextInt();
            return new Square(side);
        } else if (shape == 2) {
            System.out.print("Please enter the dimension of side: ");
            int side = scan.nextInt();
            System.out.print("Please enter the dimension of height: ");
            int height = scan.nextInt();
            return new Rhombus(side, height);
        } else if (shape == 3) {
            System.out.print("Please enter the dimension of radius: ");
            int radius = scan.nextInt();
            return new Circle(radius);
        } else if (shape == 4) {
            System.out.print("Please enter the dimension of side: ");
            int side = scan.nextInt();
            System.out.print("Please enter the dimension of height: ");
            int height = scan.nextInt();
            return new Triangle(side, height);
        }
        else return null;
    }
}





