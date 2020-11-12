import static uutf.Assertions.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Demo JUNIT");

        try {
            System.out.println("AddIntegers");
            int x = 1;
            int y = 1;
            assertEquals(2, x + y);
            System.out.println("SUCCESS");
        } catch (AssertionError ae) {
            System.out.println("FAIL!");
        }

        try {
            System.out.println("SubIntegers");
            int x = 1;
            int y = 1;
            assertEquals(2, x - y);
            System.out.println("SUCCESS");
        } catch (AssertionError ae) {
            System.out.println("FAIL!");
        }


    }

}
