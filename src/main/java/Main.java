import tests.*;
import uutf.TestRunner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Demo JUNIT");

        TestRunner runner = new TestRunner();

        runner.addCase(new AddIntegers());
        runner.addCase(new SubIntegers());
        runner.addCase(new ThrowAnException());

        runner.run();

    }
}
