package Week9_1;

interface Shape extends Colored {

    default double getPI() {
        return 3.14;
    }

    double getArea();
    double getPerimeter();

    default String getDimension() {
        return "2D";
    }
}
