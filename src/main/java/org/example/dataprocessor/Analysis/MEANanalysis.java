package org.example.dataprocessor;
import java.util.List;
public class MEANanalysis implements analysisstrategy {
    public double analyze(List<Integer> data) {
        if (data.isEmpty()) return Double.NaN;

        double sum = 0;
        for (int num : data) {
            sum += num;
        }
        return sum / data.size();
    }
}
