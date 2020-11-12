package uutf;

public abstract class TestCase {

    public final void run() {
        try {
            System.out.println(this.getClass().getCanonicalName());
            test();
            System.out.println("SUCCESS");
        } catch (AssertionError ae) {
            System.out.println("FAIL!");
        }
    }

    protected abstract void test(); // Template Method

}
