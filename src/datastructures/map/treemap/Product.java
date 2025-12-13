package datastructures.map.treemap;

//* Al emplear arboles debemos implementar la interfaz Comparable

import java.util.Map;
import java.util.TreeMap;

public class Product implements Comparable<Product> {
  private int id;
  private String name;

  public Product(int id, String name) {
      this.id = id;
      this.name = name;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("Product{");
      sb.append("id=").append(id);
      sb.append(", name=").append(name);
      sb.append('}');
      return sb.toString();
  }

  @Override
  public int compareTo(Product o) {
      return Integer.compare(this.id, o.id);
  }

  public static void main(String[] args) {

      //* Emplear una clase como clave es util cuando debemos ordenar por mas de un atributo
      Map<Product, Double> priceMap = new TreeMap<>();

      priceMap.put(new Product(191, "Laptop"), 1200.0);
      priceMap.put(new Product(192, "Smartphone"), 500.0);
      priceMap.put(new Product(193, "Tablet"), 700.0);
      System.out.println(priceMap);

      priceMap.remove(new Product(191, "Laptop"), 1200.0);

      System.out.println(priceMap);

      priceMap.put(new Product(193, "Tablet"), 800.0);

      System.out.println(priceMap);

      System.out.println(priceMap.get(new Product(193, "Tablet")));
  }



}