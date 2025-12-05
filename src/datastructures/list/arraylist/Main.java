package datastructures.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
      //* Una lista en Java es una interfaz que representa una coleccion ordenada
      //* de elementos

      //* Cuando creamos un ArrayList estamos creando un arreglo
      //* esta arreglo tiene un tamano de 10 elementos, cuando se completa se crea
      //* un nuevo arreglo 50% mas grande que el anterior y copia los elementos
      //* del arreglo anterior en el nuevo

      //* Las ventajas principales al uso de el ArrayList en lugar de un simple Array
      //* es que tenemos todos los siguientes metodos que podemos emplear
      List<String> students = new ArrayList<>();
      students.add("Ana");
      students.add("Maria");
      students.add("Gabriel");
      students.add("Fernando");

      System.out.println(students);
      System.out.println(students.get(0));
      System.out.println(students.remove(0));
      System.out.println(students);
      System.out.println(students.set(0, "Marcelo"));
      System.out.println(students);
      System.out.println(students.contains("Gabriel"));
  }
}