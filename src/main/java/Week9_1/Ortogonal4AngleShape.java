package Week9_1;

abstract public class Ortogonal4AngleShape implements Quadrangle, Shape {

    @Override
    public double getSmallDiagonal(){
        return getBigDiagonal();
    }
}
