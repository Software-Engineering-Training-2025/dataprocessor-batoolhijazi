package org.example.dataprocessor;
import java.util.Collections;
import java.util.List;
public class MEDIANanalysis implements analysisstrategy{
    public double analyze(List<Integer> data) {
        if (data.isEmpty()) return Double.NaN;

        Collections.sort(data);
        int n = data.size();
        if (n % 2 == 1) {
            return data.get(n / 2);
        } else {
            return (data.get(n / 2 - 1) + data.get(n / 2)) / 2.0;
        }
    }
}
