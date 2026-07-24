/**
 *  Java program to demonstrate HashMap usage.
 */

package com.mycollections;

import java.util.HashMap;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating a HashMap instance.
        HashMap<Integer, String> myMap = new HashMap<>();

        // Adding elements.
        myMap.put(3, "Dior");
        myMap.put(4, "Chanel");
        myMap.put(8, "Nivea");
        myMap.put(9, "Camillen");
        myMap.put(11, "Schwarzkopf");

        // Printing values of myMap .
        System.out.println(myMap); // Output:

        // Get.
        System.out.println("Number 8 is " + myMap.get(8)); // Output:
        System.out.println("Number 11 is " + myMap.get(11)); // Output:

        // Check if key value present or not.
        System.out.println("Key 4 is present: " + myMap.containsKey(4)); // Output:
        System.out.println("Key 9 is present: " + myMap.containsKey(9)); // Output:

        System.out.println("All elements: ");
        // Iterating through population HashMap.
        for (Integer element : myMap.keySet()) {
            System.out.println(myMap.get(element));
        }

        // Size.
        System.out.println("Size of map is " + myMap.size()); // Output: Size of map is 5

    }
}