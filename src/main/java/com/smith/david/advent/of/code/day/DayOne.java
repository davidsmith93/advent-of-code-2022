package com.smith.david.advent.of.code.day;

import com.smith.david.advent.of.code.dto.Output;
import com.smith.david.advent.of.code.util.FileUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

public class DayOne {
    public Output<Integer, Integer> execute() throws IOException {
        final var calories = new ArrayList<Integer>();
        final var currentCalories = new AtomicInteger();

        FileUtil.read("day-1.txt",
            line -> {
                if(line.isBlank()) {
                    calories.add(currentCalories.get());
                    currentCalories.set(0);
                } else {
                    currentCalories.addAndGet(Integer.parseInt(line));
                }
            }
        );

        final var orderedResults = calories.stream()
            .sorted(Comparator.reverseOrder())
            .toList();

        return new Output<Integer, Integer>()
            .setPart1Result(orderedResults.get(0))
            .setPart2Result(
                orderedResults.get(0) +
                orderedResults.get(1) +
                orderedResults.get(2)
            );
    }
}
