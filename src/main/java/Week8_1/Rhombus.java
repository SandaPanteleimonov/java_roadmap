package Week8_1;

public class Rhombus extends Shape{

    private int height;
    private int side;

    public Rhombus(int height, int side) {
        this.height = height;
        this.side=side;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea()
    {
        return side * height;
    }

    @Override
    public double getPerimeter() {
        return side*4;
    }
}
