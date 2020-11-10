package Week9_1;

import java.util.Scanner;

abstract public class ShapeMystery {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose number of shape: square (1), rhombus (2), circle (3), triangle (4) or rectangle (5). ");
        System.out.print("Please enter the number of which shape you want: ");
        int shape = scan.nextInt();
        Shape mysteryShape = resultFigure(shape);
        assert mysteryShape != null;
        System.out.println("Area of chosen shape is " + mysteryShape.getArea());
        System.out.println("Perimeter of chosen shape is " + mysteryShape.getPerimeter());
    }

    public static Shape resultFigure(int shape) {
        Scanner scan = new Scanner(System.in);

        switch (shape) {
            case 1: {
                System.out.print("Please enter the dimension of side: ");
                int side = scan.nextInt();
                return new Square(side);
            }
            case 2: {
                System.out.print("Please enter big diagonal and small diagonal: ");
                int diagonal1 = scan.nextInt();
                int diagonal2 = scan.nextInt();
                return new Rhombus(diagonal1, diagonal2);
            }
            case 3:
                System.out.print("Please enter radius: ");
                int radius = scan.nextInt();
                return new Circle(radius);
            case 4: {
                System.out.print("Please enter three sides: ");
                int side1 = scan.nextInt();
                int side2 = scan.nextInt();
                int side3 = scan.nextInt();
                return new Triangle(side1, side2, side3);
            }
            case 5: {
                System.out.print("Please enter two sides: ");
                int side1 = scan.nextInt();
                int side2 = scan.nextInt();
                return new Rectangle(side1, side2);
            }
            default:
                return null;
        }
    }
}






