package uutf;

public abstract class SingleTestCase extends TestCase {

    private final static String DEFAULT_TEST_METHOD = "test";

    public SingleTestCase() { this.initialize(DEFAULT_TEST_METHOD); }

    public abstract void test();

}
