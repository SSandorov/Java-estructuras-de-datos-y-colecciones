package datastructures.set.treeset;

import java.util.Set;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    //* La diferencia es que los arboles son mas eficientes en las busquedas, ya que en cada movimiento descartan
    //* la mitad de la informacion de manera recursiva
    //* tambien a medida que vamos agregando datos los va ordenando
    //* el costo que tiene agregar o eliminar elementos al arbol es mayor que en una lista
    Set<Integer> numbers = new TreeSet<>();

    numbers.add(10);
    numbers.add(5);
    numbers.add(1);
    numbers.add(3);
    numbers.add(3);
    numbers.add(3);

    System.out.println(numbers);

    numbers.remove(3);

    System.out.println(numbers);

    numbers.remove(1);
    numbers.add(90);
    System.out.println(numbers);
  }
}