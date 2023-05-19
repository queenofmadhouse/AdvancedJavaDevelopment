package org.example.generics;

import java.util.Arrays;
import java.util.List;

/*
Generic methods
 */
public class SecondExample {

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "orange"};
        Integer[] numbers = {1, 3, 7};

        List<String> stringList = convertArrayToList(words);
        List<Integer> integerList = convertArrayToList(numbers);

        System.out.println(stringList);
        System.out.println(integerList);
    }

    /*
    This is our method witch use generic <T> to declare that we can use for converting any array to List
    with array type. We can put in this method any type of array: String[], Integer[], Boolean[], etc.
    And it will return us List<String>, List<Integer>, List<Boolean>, etc.
    => we can create only one method for this operation.
     */
    private static <T> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
    }
}
