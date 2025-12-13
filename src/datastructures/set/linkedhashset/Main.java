package datastructures.set.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    //* Es un set doblemente enlazado con el nodo anterior y el nodo siguiente
    //* A diferencia del hashset, los valores estan ordenados
    Set<Integer> numbers = new LinkedHashSet<>();

    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    numbers.add(50);
    numbers.add(60);
    numbers.add(60);
    numbers.add(60);

    System.out.println(numbers);

    numbers.remove(30);

    System.out.println(numbers);

    numbers.remove(60);
    numbers.add(90);
    System.out.println(numbers);
  }
}