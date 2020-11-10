package Week9_1;

public class Triangle implements Shape {

    private double side1;
    private double side2;
    private double side3;
    private String color;

    public Triangle(double side1, double side2, double side3) {
        this.color="Melon";
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    @Override
    public double getArea() {
        return Math.sqrt((side1+side2)*(side2+side3)*(side3+side1));
    }

    @Override
    public double getPerimeter() {
        return side1+side2+side3;
    }

    @Override
    public String getColor() {
        return color;
    }
}
