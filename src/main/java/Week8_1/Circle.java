package Week8_1;

public class Circle extends Shape {

    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }

    PiGenerator x = PiGenerator.getInstance();

    //Calculate and return area of rectangle
    @Override
    public double getArea()
    {
        return Math.pow(radius, 2)*x.pi;
    }

    @Override
    public double getPerimeter()
    {
        return 2*x.pi*radius;
    }
}
