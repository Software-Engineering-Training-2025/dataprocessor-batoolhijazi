package org.example.dataprocessor;
import java.util.List;
public class STDDEVAnalysis {
    public double analyze(List<Integer> data) {
        if (data.isEmpty()) return Double.NaN;

        double mean = data.stream().mapToDouble(x -> x).average().orElse(Double.NaN);
        double variance = data.stream()
                .mapToDouble(x -> Math.pow(x - mean, 2))
                .sum() / data.size();

        return Math.sqrt(variance);
    }
}
