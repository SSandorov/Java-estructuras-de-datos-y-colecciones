package datastructures.set.treeset;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Person implements Comparable<Person> {
  private String name;
  private String dni;

  public Person(String name, String dni) {
    this.name = name;
    this.dni = dni;
  }

  //* es el metodo que se emplea cuando queremos agregar un elemento a un hashset
  //* este metodo se ejecutara autonamticamente cuando agreguemos un elemento al hashset
  //* las clases wrappers lo haran con el dato respectivo, mientras que las clases
  //* personalizadas lo haran con los datos que nosotros mandemos
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 47 * hash + Objects.hashCode(this.dni);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if (getClass() != obj.getClass()) {
        return false;
    }
    final Person other = (Person) obj;
    return Objects.equals(this.dni, other.dni);
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("Person{");
      sb.append("name=").append(name);
      sb.append(", dni=").append(dni);
      sb.append('}');
      return sb.toString();
  }

  //* Debemos implementar el metodo compareTo de la interfaz Comparable para poder
  //* utilizar la estructura de dato treeset con clases personalizadas
  @Override
    public int compareTo(Person o) {
        return this.dni.compareTo(o.dni);
    }

  public static void main(String[] args) {
      Set<Person> persons = new TreeSet<>();

      Person person1 = new Person("Maria", "123");
      Person person2 = new Person("Ana", "456");
      Person person3 = new Person("Ana", "456");
      //! No funciona con valores nulos
      // Person person4 = null;

      persons.add(person1);
      persons.add(person2);
      persons.add(person3);
      // persons.add(person4);

      for (Person person: persons) {
        if (person != null) System.out.println(person.name);
      }
      persons.remove(person2);

      System.out.println(persons);
  }

}