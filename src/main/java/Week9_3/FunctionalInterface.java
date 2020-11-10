package Week9_3;

public class FunctionalInterface {

    interface NumericTest {

        boolean calculate(int n);
    }

    public static void main(String args[]) {
        NumericTest isEven = (n) -> (n % 2) == 0;
        NumericTest isNegative = (n) -> (n < 0);

        // Output: false
        System.out.println(isEven.calculate(4));

        // Output: true
        System.out.println(isNegative.calculate(-1));
    }
}