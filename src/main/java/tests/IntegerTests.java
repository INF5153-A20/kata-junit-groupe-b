package tests;

import uutf.Test;
import uutf.TestCase;
import uutf.TestSuite;

import static uutf.Assertions.assertEquals;

public class IntegerTests extends TestCase {

    private int x,y = 0;

    @Override
    protected void setUp() {
        x = 1;
        y = 1;
    }

    public void addTwoIntegers() {
        assertEquals(2, x + y);
    }

    public void subTwoIntegers() {
        assertEquals(2, x - y);
    }

    public void throwAnException() {
        throw new RuntimeException("pouet");
    }

    public static Test build() {
        TestSuite suite = new TestSuite();
        suite.addCase(new IntegerTests().initialize("addTwoIntegers"));
        suite.addCase(new IntegerTests().initialize("subTwoIntegers"));
        suite.addCase(new IntegerTests().initialize("throwAnException"));
        return suite;
    }

}
