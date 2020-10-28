package Week8_1;

public class Square extends Shape {

    private int side;
    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea()
    {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter()
    {
        return side*4;
    }
}
