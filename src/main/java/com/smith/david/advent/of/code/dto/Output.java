package com.smith.david.advent.of.code.dto;

public class Output<T, U> {
    private T part1Result;
    private U part2Result;

    public T getPart1Result() {
        return part1Result;
    }

    public Output<T, U> setPart1Result(T part1Result) {
        this.part1Result = part1Result;
        return this;
    }

    public U getPart2Result() {
        return part2Result;
    }

    public Output<T, U> setPart2Result(U part2Result) {
        this.part2Result = part2Result;
        return this;
    }
}
