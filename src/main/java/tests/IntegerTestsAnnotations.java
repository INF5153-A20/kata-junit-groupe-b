package tests;

import uutf.TestCase;
import uutf.TestMethod;

import static uutf.Assertions.assertEquals;

public class IntegerTestsAnnotations extends TestCase {

    private int x,y = 0;

    @Override
    protected void setUp() {
        x = 1;
        y = 1;
    }

    @TestMethod
    public void addTwoIntegers() {
        assertEquals(2, x + y);
    }

    @TestMethod
    public void subTwoIntegers() {
        assertEquals(2, x - y);
    }

    @TestMethod
    public void throwAnException() {
        throw new RuntimeException("pouet");
    }

}
