package uutf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestRunner {

    public ResultCollector run(Test t) {
        ResultCollector collector = new ResultCollector();
        t.run(collector);
        return collector;
    }

    public void runAndPrint(Test t) {
        System.out.println(this.run(t));
    }

}
