package uutf;

public abstract class TestCase extends Test {

    public final void run(ResultCollector rc) {
        TestResult result = new TestResult(this.getClass().getCanonicalName());
        try {
            test();
            result.setStatus(STATUS.PASSED);
        } catch (AssertionError ae) {
            result.setStatus(STATUS.FAILED);
        } catch (Exception e) {
            result.setStatus(STATUS.ERRORED);
        }
        rc.addResult(result);
    }

    protected abstract void test(); // Template Method

}
