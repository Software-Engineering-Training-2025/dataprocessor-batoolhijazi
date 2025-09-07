package org.example.dataprocessor.enums.cleaning;

import java.util.List;
import java.util.stream.Collectors;

public class removenegativecleaning implements cleaningstrategy {
    public List<Integer> clean(List<Integer> data) {

        return data.stream()
                .filter(x -> x >= 0)
                .collect(Collectors.toList());
    }
}
