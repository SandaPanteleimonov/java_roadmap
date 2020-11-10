package Week9_1;

import java.util.Scanner;

public class Rectangle extends Ortogonal4AngleShape {
    private double side1, side2;
    private String color;
    Scanner sc = new Scanner(System.in);

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
        this.color = "Honey";
    }


    public double getArea() {
        return (side1*side2);
    }

    public double getPerimeter() {
        return (side1+side2)*2;
    }


    @Override
    public double getBigDiagonal() {
        double diagonal1 = Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));
        return diagonal1;
    }

    @Override
    public String getColor() {
        return color;
    }
}
