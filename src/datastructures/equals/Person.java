package datastructures.equals;

import java.util.Objects;

public class Person {
  private String name;

  public Person(String name) {
      this.name = name;
  }

  @Override
  public boolean equals(Object o) {
      //* Primero comprueba si ambos Objetos tienen distintas direcciones
      //* en memoria
      if (this == o) return true;
      //* getClass() comprueba que ambos objetos son del mismo tipo
      if (o == null || getClass() != o.getClass()) return false;
      //* casteamos para poder acceder a sus propiedades
      Person person = (Person) o;
      //* comparamos los datos
      return Objects.equals(name, person.name);
  }

  public static void main(String[] args) {
      Person person1 = new Person("Juan");
      Person person2 = new Person("Maria");
      Person person3 = new Person("Juan");

      //* Comprueba los datos
      System.out.println(person2.equals(person1));
      System.out.println(person3.equals(person1));
  }


}