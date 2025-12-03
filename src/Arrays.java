public class Arrays {
  public static void main(String[] args) {
    //* Si creamos un arreglo vacio con el primitivo nos rellena todos los elementos con un cero
    int[] numbersPrimitive = new int[5];

    numbersPrimitive[0] = 10;
    numbersPrimitive[1] = 20;

    //* Para poder anadir uno o varios elementos mas al arreglo, debemos hacer lo siguiente
    int[] newNumbersPrimitive = new int[numbersPrimitive.length + 1];
    System.arraycopy(numbersPrimitive, 0, newNumbersPrimitive, 0, numbersPrimitive.length);
    newNumbersPrimitive[5] = 500;

    System.out.println("Tipo primitivo");
    for (int number: newNumbersPrimitive) {
      System.out.println(number);
    }

    //* Si creamos un arreglo vacio con el wrapper nos rellena todos los elementos con null
    Integer[] numbersWrapper = new Integer[5];

    numbersWrapper[0] = 30;
    numbersWrapper[1] = 40;

    System.out.println("Tipo wrapper");
    for (Integer number: numbersWrapper) {
      System.out.println(number);
    }

    //* Eliminar elementos dentro del arreglo a mano
    int[] numbersDelete = {1, 2, 3, 4, 5, 6, 0 , 9};
    int deletePosition = 2;

    for(int i = deletePosition; i < numbersDelete.length - 1; i++) {
      numbersDelete[i] = numbersDelete[i + 1];
    }
    numbersDelete[numbersDelete.length - 1] = 0;
    System.out.println("Delete element manually");
    for (int number: numbersDelete) {
      System.out.println(number);
    }
  }
}