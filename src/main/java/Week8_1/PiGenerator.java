package Week8_1;

public class PiGenerator {

    private static PiGenerator piNumber=null;
    public double pi;

    private PiGenerator()
    {
        pi=3.14;
    }

    public static PiGenerator getInstance(){
        while (piNumber==null)
        piNumber= new PiGenerator();
                return piNumber;
    }
}
