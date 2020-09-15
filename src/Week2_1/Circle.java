package Week2_1;

import java.util.Scanner;

public class Circle {
    public static void main(String[]args)
    {
        double radius;
        double area;
        double perimeter;

        radius = getRadius();
        area = getArea(radius);
        perimeter = getPerimeter(radius);
    }
    //Introduce radius, while using Scanner
    private static double getRadius()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter radius - ");
        double radius = keyboard.nextDouble();
        System.out.println("The radius is " + radius);
        return radius;
    }
    //Create method for area
    private static double getArea(double radius)
    {
        double area = Math.PI * radius * radius;
        System.out.println("The area is: " + area);
        return area;
    }

    //Create method for perimeter
    private static double getPerimeter(double radius)
    {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("The perimeter is: " + perimeter);
        return perimeter;
    }

}