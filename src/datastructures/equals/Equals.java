package datastructures.equals;

public class Equals {
  public static void main(String[] args) {
      Integer numberA = 100;
      Integer numberB = 100;

      System.out.println("Dentro del cache de Integers");

      //* Preguntamos si estas direcciones de memoria son exactamente iguales
      System.out.println(numberB == numberA);
      //* Con equals comparamos los datos
      System.out.println(numberB.equals(numberA));

      //* La razon por la que ambos son true es porque Java almacena un cache
      //* de Integers desde el valor -128 hasta el 127
      numberA = 128;
      numberB = 128;

      System.out.println("Fuera del cache de Integers");
      System.out.println(numberB == numberA);
      System.out.println(numberB.equals(numberA));

      //* como vemos ahora nos devuelve false
  }
} 