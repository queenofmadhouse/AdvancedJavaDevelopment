package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class FirstExample {

    public static void main(String[] args) {
        List shapes = new ArrayList();
        shapes.add("Circle");

        System.out.println(shapes.get(0));

        String shape = (String) shapes.get(0);
        /*
        Cause if you add smth to list without generics - it will be Object-type
        Another problem is that you can add to this list any object, cause all object in java hava have
        object is a parent, that's why using generics in lists absolutely necessary. In this case with
        String we need to use: List<String shapes = new ArrayList<>(), it also help ass with type-safety,
        you will see how it works in next code
         */
        shapes.add(1); // For demonstration, we will add int in this array

        for(int i = 0; i < shapes.size(); i++) {
            String stringForStep = (String) shapes.get(i);

            System.out.println(stringForStep);
        }
        /*
        You will have ClassCastException in for step, cause:
         first step: you trying cast shapes.get(0) (originally it's String = "Circle") to String and it's ok
         second step: you trying cast shapes.get(1) (originally it's Integer = 1) to String and that's not ok, cause in Java
         we have strong typing and we can't cast using basic casing. By the way, we have ability to use toString()
         but that's bad practice in this situation

        P.S: on the second step we will have Integer (not int) cause java use autoboxing for numbers in list's without
        using generics
         */
    }
}
