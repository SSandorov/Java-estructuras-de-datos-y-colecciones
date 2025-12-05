package datastructures.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
      //* A diferencia del ArrayList estan basados en nodos, son llamadas tambien
      //* listas doblemente enlazadas
      //* Cada nodo va a tener tanto la direccion del nodo anterior como el del
      //* nodo siguiente

      //* Son utiles cuando se realizan muchas inserciones o eliminaciones en el medio
      //* No necesitamos desplazar todos los elementos, solo cambiar las referencias
      //* del nodo
      List<String> cities = new LinkedList<>();

      cities.add("Buenos Aires");
      cities.add("Paris");
      cities.add("Nueva York");


      System.out.println(cities.get(2));
      System.out.println(cities.set(2, "Madrid"));
      System.out.println(cities.remove("Paris"));

      //! Ya no es necesario hacer el casteo desde la version 21 de JDK
      //! ahora estos metodos estan incluidos por defecto en la interfaz
      //! List
      ((LinkedList<String>)cities).addFirst("London");
      ((LinkedList<String>)cities).addLast("Berlin");
      ((LinkedList<String>)cities).removeFirst();
      ((LinkedList<String>)cities).removeLast();

      String searchCity = "Buenos Aires";

      if (cities.contains(searchCity)) {
        System.out.println("Esta en la lista");
      } else {
        System.out.println("No esta en la lista");
      }

      for (String city: cities) {
        System.out.println("- " + city);
      }
  }
}