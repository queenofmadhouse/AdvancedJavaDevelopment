package org.example.datastuctures;

import java.util.LinkedList;

public class FirstExample {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // O(1)
        list.add("first item");
        list.add("second item");

        // O(n) (n = list length)
        System.out.println(list);

        // O(1) (cause linked list store index of head and tail of list and we will have fast access
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // .poll delete one object of list (from head) and return it as answer
        String returned1 = list.poll();
        System.out.println(returned1);

        // .pop delete one object of list (from head) and return it as answer
        String returned2 = list.pop();
        System.out.println(returned2);

        /*
        The difference between .poll() and .pop() is that if we call .poll() on
        empty list it will do nothing and return null. But if we call .pop() on empty list
        it will throw exception (NoSuchElementException)
         */
    }
}
