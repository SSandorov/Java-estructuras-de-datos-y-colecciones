package datastructures.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    //* En el treeMap los elementos son ordenados. En este ejemplo ordena la clase
    //* Wrapper de String en orden alfabetico
    Map<String, Integer> productPrices = new TreeMap<>();

    //* agregamos valores con el metodo put
    productPrices.put("Laptop", 1000);
    productPrices.put("Smartphone", 500);
    productPrices.put("Tablet", 800);

    System.out.println(productPrices);

    //* buscar elementos en el mapa
    System.out.println(productPrices.get("Laptop"));

    //* actualizar valores
    productPrices.put("Tablet", 900);
    System.out.println(productPrices);

    //* eliminar valores
    productPrices.remove("Laptop");
    System.out.println(productPrices);
  }
}