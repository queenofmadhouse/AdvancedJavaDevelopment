package org.example.generics;

import java.util.Arrays;
import java.util.List;

/*
Bounded generics methods
For this example we will use some code from second example
 */
public class ThirdExample {

    public static void main(String[] args) {
        Integer[] numbersInteger = {1, 3, 7};
        Double[] numbersDouble = {1.1, 3.3, 7.7};

        List<Integer> integerList = convertArrayToList(numbersInteger);
        List<Double> doubleList = convertArrayToList(numbersDouble);

        System.out.println(integerList);
        System.out.println(doubleList);
    }

    /*
    In this example we declare that T - is any child of Number.
    Now we can use only arrays of type, that extends Number.
     */
    private static <T extends Number> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
    }
}
