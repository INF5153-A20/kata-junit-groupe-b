package uutf;
public class Assertions {

    public static void assertTrue(boolean condition) {
        if(!condition)
            throw new AssertionError();
    }

    public static void assertEquals(int oracle, int value){
        assertTrue(oracle == value);
    }

}
