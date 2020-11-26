import tests.*;
import uutf.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Demo JUNIT");
        TestRunner runner = new TestRunner();
        TestFactory scanner = new TestFactoryMethod();
        runner.runAndPrint(scanner.scan(IntegerTests.class));

        scanner = new TestFactoryAnnotation();
        runner.runAndPrint(scanner.scan(IntegerTestsAnnotations.class));

        System.out.println("Demo JUNIT - SingleTest");
        runner = new TestRunner();
        TestCase t = new AddTwoIntegers();
        t.initialize("doublePouet");
        runner.runAndPrint(t);

    }
}
