package datastructures.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public  class Main {
  public static void main(String[] args) {
      //* Los mapas a diferencia de las listas y de los sets no implementan la interfaz
      //* Collection, sino que implementan la interfaz Map, lo que quiere decir
      //* que no implementan los mismo metodos

      //* Los mapas se componen de elementos con pares de llaves y valores
      //* son muy eficientes para la busqueda de los datos al tener llaves unicas

      //* los mapas principales siguen el mismo patron y comportamiento que las listas y los sets
      //* esta el hashmap, el linkedhashmap y el treemap

      Map<String, Integer> productPrices = new HashMap<>();

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