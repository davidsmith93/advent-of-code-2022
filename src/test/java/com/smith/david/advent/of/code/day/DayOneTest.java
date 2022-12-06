package com.smith.david.advent.of.code.day;

import org.junit.jupiter.api.Test;

import java.io.IOException;

class DayOneTest {
    @Test
    void execute() throws IOException {
        final var output = new DayOne().execute();
        System.out.println(output.getPart1Result());
        System.out.println(output.getPart2Result());
    }
}