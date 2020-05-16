package com.nivafex.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.function.Consumer;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        //add elements to hash set.
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");
        Consumer<String> pw = System.out::println;
        pw.accept(hs.toString());

        TreeSet<String> ts = new TreeSet<>(hs);
        pw.accept(ts.toString());
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (-1) * o1.compareTo(o2);
            }
        };
        //TreeSet<String> ts1 = new TreeSet<>((x, y) -> (-1) * x.compareTo(y));
        TreeSet<String> ts1 = new TreeSet<>(comparator::compare);
        ts1.addAll(hs);
        pw.accept(ts1.toString());
        pw.accept(ts1.subSet("Gamma", "Beta").toString());

    }
}
