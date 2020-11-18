package uutf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ResultCollector {

    private Set<TestResult> results = new HashSet();
    public void addResult(TestResult tr) {
        this.results.add(tr);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Map<STATUS,Integer> counters = new HashMap<>();
        for(TestResult tr: results) {
            counters.put(tr.getStatus(),
                    1+counters.getOrDefault(tr.getStatus(),0));
            builder.append(tr).append("\n");
        }
        builder.append(counters);
        return builder.toString();
    }
}
