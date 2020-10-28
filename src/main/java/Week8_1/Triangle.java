package Week8_1;

public class Triangle extends Shape
{
    private int height;
    private int side;


    public Triangle(int side, int height) {
        this.side = side;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea()
    {
        return 0.5*height * side;
    }

    //Determinate hypotenuse with Math.pow(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2),0.5)
    @Override
    public double getPerimeter()
    {
        return height+side+(Math.pow(Math.pow(side, 2) + Math.pow(height, 2),0.5));
    }
}
