package Week9_1;

public class Square extends Ortogonal4AngleShape {

    private double side;
    private String color;

    public Square(double side) {
        this.side = side;
        this.color = "Green";
    }

    public double getArea()
    {
        return Math.pow(side, 2);
    }
    public double getPerimeter()
    {
        return side*4;
    }

    @Override
    public double getBigDiagonal() {
        return Math.sqrt(2*Math.pow(side,2));
    }

    @Override
    public String getColor() {
        return color;
    }
}
