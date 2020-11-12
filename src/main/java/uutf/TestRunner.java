package uutf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestRunner {

    private Set<TestCase> cases = new HashSet<>();

    public void addCase(TestCase aCase) {
        cases.add(aCase);
    }

    public void run() {
        Map<STATUS,Integer> counters = new HashMap<>();
        Set<TestResult> results = new HashSet<>();
        for (TestCase test: cases) {
            TestResult res = test.run();
            counters.put(res.getStatus(),
                    1+counters.getOrDefault(res.getStatus(),0));
            results.add(res);
        }
        results.forEach(System.out::println);
        System.out.println(counters);
    }

}
