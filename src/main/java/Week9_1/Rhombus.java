package Week9_1;

public class Rhombus implements Shape, Quadrangle {

    private double diagonal1, diagonal2;
    private String color;

    public Rhombus(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.color = "Pink";
    }

    @Override
    public double getBigDiagonal() {
        return diagonal1;
    }

    @Override
    public double getSmallDiagonal() {
        return diagonal2;
    }

    public double getArea() {
        return (diagonal1*diagonal2)/2;
    }

    public double getPerimeter() {
        return Math.pow(diagonal1,2)+Math.pow(diagonal2,2);
    }

    @Override
    public String getColor() {
        return color;
    }
}
