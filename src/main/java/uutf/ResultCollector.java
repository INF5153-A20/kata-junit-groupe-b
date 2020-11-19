package uutf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ResultCollector {

    private Map<STATUS,Integer> counters = new HashMap<>();
    private Set<TestResult> results = new HashSet<>();

    public void addResult(TestResult tr) {
        this.results.add(tr);
        counters.put(tr.getStatus(),
                1+counters.getOrDefault(tr.getStatus(),0));
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(TestResult tr: results) {
            builder.append(tr).append("\n");
        }
         builder.append(counters).append("\n");
        return builder.toString();
    }
}
