package com.nivafex.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        Consumer<String> pw = System.out::println;
        pw.accept("Initial size of al: " + al.size());
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        pw.accept("Size of al after additions: " + al.size());
        pw.accept("Contents of al: " + al);
        Collections.sort(al, (x, y) -> x.compareTo(y));
        pw.accept("After sorting: " + al);
        al.remove("F");
        al.remove(2);
        pw.accept("Size of al after deleting: " + al.size());
        pw.accept("Contents of al: " + al);

    }
}
