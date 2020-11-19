package uutf;

public abstract class TestCase implements  Test {

    public final void run(ResultCollector collector) {
        TestResult result = new TestResult(this.getClass().getCanonicalName());
        try {
            setUp();
            test();
            result.setStatus(STATUS.PASSED);
        } catch (AssertionError ae) {
            result.setStatus(STATUS.FAILED);
        } catch (Exception e) {
            result.setStatus(STATUS.ERRORED);
        } finally {
            tearDown();
        }
        collector.addResult(result);
    }

    protected  void setUp() { };
    protected abstract void test(); // Template Method
    protected  void tearDown() {};

}
