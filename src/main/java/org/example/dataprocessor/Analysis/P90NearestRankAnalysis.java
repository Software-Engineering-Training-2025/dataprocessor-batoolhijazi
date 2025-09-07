package org.example.dataprocessor;
import java.util.Collections;

import java.util.List;
public class P90NearestRankAnalysis implements analysisstrategy {
    public double analyze(List<Integer> data) {
        if (data.isEmpty()) return Double.NaN;

        Collections.sort(data);
        int n = data.size();
        int rank = (int) Math.ceil(0.90 * n);
        return data.get(rank - 1);
    }
}
