package com.nivafex.lambdas;

import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest {
    public static Double select(Double x) {
        return x * 12.1;
    }

    public static void main(String[] args) {
        Function<Double, Double> calc = LambdaTest::select;
        System.out.println(calc.apply(15.1));
        Consumer<String> pw = System.out::println;
        pw.accept("hello world");
    }
}
