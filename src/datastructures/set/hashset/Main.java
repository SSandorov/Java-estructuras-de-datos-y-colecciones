package datastructures.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
      //* Los set son colecciones dinamicas que no tienen un orden especifico de
      //* insercion a diferencia de las listas
      //* tampoco aceptan valores duplicados
      //* los duplicados se detectan a traves del hash del elemento, ya que cada
      //* caracter tiene su propio hash
      //! Solo funciona con las clases Wrapper, en clases personalizadas hay que
      //! definir el hash
      Set<Integer> numbers = new HashSet<>();

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

      //* Para actualizar valores en un set no tenemos el metodo set de las listas,
      //* debemos eliminar el valor y luego anadir uno nuevo
      numbers.remove(60);
      numbers.add(90);
      System.out.println(numbers);

  }
}