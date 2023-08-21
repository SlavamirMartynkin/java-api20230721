package lesson6;

import java.util.*;

public class Tasks {

  public static void main(String[] args) {
    ArrayList<Integer> ints = new ArrayList<>(List.of(1, 2, 2, 3, 4, 1, 1, 5, 10));
    System.out.println(uniqueCount(ints));
  }

  /**
   * [1, 2, 2, 3, 4, 1, 1, 5, 10]
   * <p>
   * Нужно посчитать количество уникальных элементов, то есть элементов, которые встречаются только 1 раз.
   */
  static int uniqueCount(Collection<Integer> ints) {
    // unique = [3, 4]
    // visited = [1, 2, 3, 4]

    Set<Integer> unique = new HashSet<>();
    Set<Integer> visited = new HashSet<>();

    for (Integer x : ints) {
      if (visited.add(x)) {
        unique.add(x);
      } else {
        unique.remove(x);
      }
    }
    return unique.size();
  }

}
