package lesson6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

  public static void main(String[] args) {
    // List - список
    // Set - множество
    // Map - словарь (key-value хранилище)

    // List <- ArrayList, LinkedList
    // Queue <- LinkedList, ArrayDeque
    // Map <- HashMap, TreeMap, LinkedHashMap


    // HashSet <- HashMap [1, object]
    // TreeSet <- TreeMap
    // LinkedHashSet <- LinkedHashMap
    Set<Integer> ints = new HashSet<>(); // TreeSet, LinkedHashSet


    // add, contains
    // remove,
    System.out.println(ints.add(3));
    System.out.println(ints.add(1));
    System.out.println(ints.add(1));
    System.out.println(ints.add(2));

    System.out.println(ints);

  }

}
