import tests.*;
import uutf.TestCase;
import uutf.TestRunner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Demo JUNIT");
        TestRunner runner = new TestRunner();
        runner.runAndPrint(IntegerTests.build());

        System.out.println("Demo JUNIT - SingleTest");
        runner = new TestRunner();
        TestCase t = new AddTwoIntegers();
        t.initialize("doublePouet");
        runner.runAndPrint(t);

    }
}
