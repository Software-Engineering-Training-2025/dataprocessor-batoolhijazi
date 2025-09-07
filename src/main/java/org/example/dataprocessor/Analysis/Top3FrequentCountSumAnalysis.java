package org.example.dataprocessor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Top3FrequentCountSumAnalysis implements analysisstrategy {
    public double analyze(List<Integer> data) {
        if (data.isEmpty()) return 0.0;


        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : data) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }


        return freq.entrySet().stream()
                .sorted((a, b) -> {
                    int cmp = b.getValue().compareTo(a.getValue());
                    if (cmp == 0) {
                        return a.getKey().compareTo(b.getKey());
                    }
                    return cmp;
                })
                .limit(3)
                .mapToInt(Map.Entry::getValue)
                .sum();
    }
}
