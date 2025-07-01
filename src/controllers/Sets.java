package controllers;

import java.util.*;

public class Sets {

    public Sets() {}

    public void construirHashSet() {
        Set<String> palabras = new HashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");

        System.out.println("Elementos del HashSet(no se asegura el orden): ");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> palabras = new LinkedHashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");

        System.out.println("Elementos del LinkedHashSet (respeta orden de inserción):");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        return palabras;
    }
    
    public void construirTreeSet() {
        Set<String> palabras = new TreeSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");

        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    public void construirTreeSetConComparador() {
        Comparator<String> miComparador = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int result = Integer.compare(s1.length(), s2.length());
                // Si tienen la misma longitud, se comparan alfbabeticamente
                if (result == 0) {
                    return s1.compareTo(s2);
                }
                return result;
            }
        };

        Set<String> palabrasTreeSet = new TreeSet<>(miComparador);
        palabrasTreeSet.add("Laptop");
        palabrasTreeSet.add("Manzana");
        palabrasTreeSet.add("Pera");
        palabrasTreeSet.add("Celulas");
        palabrasTreeSet.add("Celular");
        palabrasTreeSet.add("Laptop");
        palabrasTreeSet.add("Pera");
        palabrasTreeSet.add("Laptop");

        for (String palabra : palabrasTreeSet) {
            System.out.println(palabra);
        }
    }

}
