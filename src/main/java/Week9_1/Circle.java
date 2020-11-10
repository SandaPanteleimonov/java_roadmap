package Week9_1;

public class Circle implements Shape {

    private double radius;
    private String color;

    public Circle(double radius) {
        this.radius = radius;
        this.color="Blue";
    }

    @Override
    public double getArea()
    {
        return Math.pow(radius,2)* getPI();
    }

    @Override
    public double getPerimeter()
    {
        double initialPerimeter = 2*radius*getPI();
        int perimeter = (int)(initialPerimeter * 100);
        return perimeter /100.;
    }

    @Override
    public String getColor(){
        return color;
    }
}
