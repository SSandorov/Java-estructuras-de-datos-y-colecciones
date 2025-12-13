package datastructures.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Person {
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

  public static void main(String[] args) {
      Map<String, Person> persons = new HashMap<>();

      Person person1 = new Person("Maria", "123");
      Person person2 = new Person("Ana", "456");
      Person person3 = new Person("Ana", "456");

      persons.put(person1.dni, person1);
      persons.put(person2.dni, person2);
      persons.put(person3.dni, person3);

      
      persons.remove(person2.dni);

      System.out.println(persons);
  }
}