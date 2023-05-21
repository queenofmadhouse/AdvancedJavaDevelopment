package org.example.datastuctures;

import java.util.HashMap;

/*
 HashMap
 */
public class SecondExample {

    public static void main(String[] args) {

        HashMap<String, Integer> basket = new HashMap<>();

        // We just put key = apple; and value for this key = 1;
        basket.put("apple", 1);
        System.out.println(basket.get("apple"));

        /*
         Also if we need to update tbe key value - we can use getOrDefault.
         Why do we need to use .getOrDefault? Cause if we only use .get("key")
         and our hash map not contains this key - it will return null and in next step
         we will have exception (when we try to null + 1). In case we use
         .getOrDefault("key", defaultValue) -  it will return founded value or value,
         that we put as a defaultValue
         */
        basket.put("apple", basket.getOrDefault("apple", 0) + 1);
        System.out.println(basket.get("apple"));

        // .containsKey("key) - check if key exist in list and return boolean
        boolean isAppleExists = basket.containsKey("apple");
        System.out.println(isAppleExists);

        /*
         .merge("key", value, func) - we can also use it if we need to add or update value.
         In this example with func = Integer::sum - it will create new key with value 1 if key is not
         exist in list or update value (key : value += 1)
         */
        basket.merge("apple", 1, Integer::sum);
        System.out.println(basket.get("apple"));
    }
}
