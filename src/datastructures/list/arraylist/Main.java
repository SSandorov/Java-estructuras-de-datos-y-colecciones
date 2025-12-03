package datastructures.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
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