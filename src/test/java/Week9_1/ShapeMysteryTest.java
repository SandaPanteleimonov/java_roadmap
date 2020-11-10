package Week9_1;

import junit.framework.TestCase;

public class ShapeMysteryTest extends TestCase {

    Circle randomCircle = new Circle(5);
    double areaCircle = randomCircle.getArea();
    double testAreaCircle = 78.5;
    double perimeterCircle = randomCircle.getPerimeter();
    double testPerimeterCircle = 31.4;

    String dimensionCircle = randomCircle.getDimension();
    String testDimensionCircle = "2D";
    String colorCircle = randomCircle.getColor();
    String testColorCircle = "Blue";


    public void testCircle() {
        System.out.println("@Test Area(): " + areaCircle + "=" + testAreaCircle);
        assertEquals(areaCircle, testAreaCircle);
        System.out.println("@Test Perimeter(): " + perimeterCircle + "=" + testPerimeterCircle);
        assertEquals(perimeterCircle, testPerimeterCircle);
        System.out.println("@Test Dimension(): " + dimensionCircle + "=" + testDimensionCircle);
        assertEquals(dimensionCircle, testDimensionCircle);
        System.out.println("@Test Color(): " + colorCircle + "=" + testColorCircle);
        assertEquals(colorCircle, testColorCircle);

    }

    Rectangle randomRectangle = new Rectangle(2, 3);
    double areaRectangle = randomRectangle.getArea();
    double testAreaRectangle = 6;
    double perimeterRectangle = randomRectangle.getPerimeter();
    double testPerimeterRectangle = 10;

    String dimensionRectangle = randomRectangle.getDimension();
    String testDimensionRectangle = "2D";
    String colorRectangle = randomRectangle.getColor();
    String testColorRectangle = "Honey";

    public void testRectangle() {
        System.out.println("@Test Area(): " + areaRectangle + "=" + testAreaRectangle);
        assertEquals(areaRectangle, testAreaRectangle);
        System.out.println("@Test Perimeter(): " + perimeterRectangle + "=" + testPerimeterRectangle);
        assertEquals(perimeterRectangle, testPerimeterRectangle);
        System.out.println("@Test Dimension(): " + dimensionRectangle + "=" + testDimensionRectangle);
        assertEquals(dimensionRectangle, testDimensionRectangle);
        System.out.println("@Test Color(): " + colorRectangle + "=" + testColorRectangle);
        assertEquals(colorRectangle, testColorRectangle);

    }

    Rhombus randomRhombus = new Rhombus(2,4);
    double areaRhombus = randomRhombus.getArea();
    double testAreaRhombus = 6;
    double perimeterRhombus = randomRhombus.getPerimeter();
    double testPerimeterRhombus = 10;

    String dimensionRhombus = randomRhombus.getDimension();
    String testDimensionRhombus = "2D";
    String colorRhombus = randomRhombus.getColor();
    String testColorRhombus = "Honey";

    public void testRhombus() {
        System.out.println("@Test Area(): " + areaRhombus + "=" + testAreaRhombus);
        assertEquals(areaRhombus, testAreaRhombus);
        System.out.println("@Test Perimeter(): " + perimeterRhombus + "=" + testPerimeterRhombus);
        assertEquals(perimeterRhombus, testPerimeterRhombus);
        System.out.println("@Test Dimension(): " + dimensionRhombus + "=" + testDimensionRhombus);
        assertEquals(dimensionRhombus, testDimensionRhombus);
        System.out.println("@Test Color(): " + colorRhombus + "=" + testColorRhombus);
        assertEquals(colorRhombus, testColorRhombus);

    }

    Square randomSquare = new Square(2);
    double areaSquare = randomSquare.getArea();
    double testAreaSquare = 4;
    double perimeterSquare = randomSquare.getPerimeter();
    double testPerimeterSquare = 8;

    String dimensionSquare = randomSquare.getDimension();
    String testDimensionSquare = "2D";
    String colorSquare = randomSquare.getColor();
    String testColorSquare = "Honey";

    public void testSquare() {
        System.out.println("@Test Area(): " + areaSquare + "=" + testAreaSquare);
        assertEquals(areaSquare, testAreaSquare);
        System.out.println("@Test Perimeter(): " + perimeterSquare + "=" + testPerimeterSquare);
        assertEquals(perimeterSquare, testPerimeterSquare);
        System.out.println("@Test Dimension(): " + dimensionSquare + "=" + testDimensionSquare);
        assertEquals(dimensionSquare, testDimensionSquare);
        System.out.println("@Test Color(): " + colorSquare + "=" + testColorSquare);
        assertEquals(colorSquare, testColorSquare);
    }


}