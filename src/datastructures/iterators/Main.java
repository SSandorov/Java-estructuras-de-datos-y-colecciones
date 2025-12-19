package datastructures.iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Ana");
        names.add("Juan");
        names.add("Carlos");

        /*
        *   Un iterador es un objeto que nos permite recorrer una coleccion secuencialmente
        *   sin exponer su estructura interna
        * 
        *   El forEach maneja internamente un objeto Iterator
        !   Es importante saber que el iterador forEach no permite modificaciones de la coleccion
        *   mientras la recorre
        */
        for (String name: names) {
            if (name.startsWith("A") || name.startsWith("C")) {
                //* Me devuelve un error al querer modificar
                // names.remove(name);
            }
        }

        //* Para eliminar elementos de la coleccion debemos emplear el objeto Iterator directamente */
        //* El objeto iterator solo nos permite movernos en una direccion en la coleccion */
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();

            if (name.startsWith("A") || name.startsWith("C")) {
                iterator.remove();
            }
        }

        System.out.println(names);

        //* Para movernos en dos direcciones y poder efectuar mas operaciones debemos emplear
        //* el objeto ListIterator

        List<String> names2 = new ArrayList<>(Arrays.asList("Gabriel", "Fernando", "Maria"));
        addName(names2, "Carlos");
        readNames(names2);
        updateName(names2, "Ana", "Gabriel");
        removeName(names2, "Maria");
        readNames(names2);

    }

    //* Operaciones CRUD con listIterator */
    public static void addName(List<String> names, String newName) {
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            String name = iterator.next();

            if (name.equals("Gabriel")) {
                iterator.add(newName);
                break;
            }
        }
    }

    public static void updateName(List<String> names, String newName, String oldName) {
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            
            if (iterator.next().equals(oldName)) {
                iterator.set(newName);
                break;
            }
        }
    }

    public static void removeName(List<String> names, String nameToDelete) {
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            
            if (iterator.next().equals(nameToDelete)) {
                iterator.remove();
                break;
            }
        }
    }

    public static void readNames(List<String> names) {
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }
}
