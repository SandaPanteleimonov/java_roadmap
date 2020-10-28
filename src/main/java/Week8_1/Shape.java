package Week8_1;

abstract public class Shape {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    abstract public double getArea();
    abstract public double getPerimeter();
}












    /*private double height;  // To hold height.
    private double width;  //To hold width or base
    private double radius;

    // Set height and width
    public void setValues(double height, double width, double radius)
    {
        this.height = height;
        this.width = width;
        this.radius= radius;
    }

    //Get height
    public double getHeight()
    {
        return height;
    }

    //Get width
    public double getWidth()
    {
        return width;
    }

    //Get radius
    public double getRadius()
    {
        return radius;
    }

    // The getArea method is abstract.
    // It must be overridden in a subclass.
    abstract public double getArea();
    abstract public double getPerimeter();
}*/