import tests.*;
import uutf.TestCase;
import uutf.TestFactory;
import uutf.TestRunner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Demo JUNIT");
        TestRunner runner = new TestRunner();
        TestFactory scanner = new TestFactory();
        runner.runAndPrint(scanner.scan(IntegerTests.class));

        System.out.println("Demo JUNIT - SingleTest");
        runner = new TestRunner();
        TestCase t = new AddTwoIntegers();
        t.initialize("doublePouet");
        runner.runAndPrint(t);

    }
}
