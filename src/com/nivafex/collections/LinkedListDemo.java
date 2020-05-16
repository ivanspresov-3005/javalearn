package com.nivafex.collections;

import java.util.LinkedList;
import java.util.function.Consumer;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        //add elements to linked list
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");
        Consumer<String> pw = System.out::println;
        pw.accept("Original contents of ll: " + ll);
        //remove elements from linked list.
        ll.remove("F");
        ll.remove(2);
        pw.accept("Contents of ll after deletion: " + ll);
        //Remove first and last elements.
        ll.removeFirst();
        ll.removeLast();
        pw.accept("ll after deleting first and last: " + ll);
        //Get and set value
        String val = ll.get(2);
        ll.set(2, val + " Changes");
        pw.accept("ll after change: " + ll);
    }
}
