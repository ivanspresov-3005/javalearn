package com.nivafex.collections;

import java.util.*;
import java.util.function.Consumer;

public class EnumSetDemo {
    public static void main(String[] args) {
        EnumSet<Season> es = EnumSet.copyOf(Arrays.asList(Season.values()));
        Consumer<String> pw = System.out::println;
        pw.accept(es.toString());
    }
}
