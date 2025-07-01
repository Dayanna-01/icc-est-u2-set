package controllers;

import java.util.Set;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {

    public Sets() {
    }

    public void construirHashSet() {
        Set<String> palabras = new HashSet<>();
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
    
    public void construirLinkedHashSet() {
        Set<String> palabrasLinkeadas = new LinkedHashSet<>();
        palabrasLinkeadas.add("Laptop");
        palabrasLinkeadas.add("Manzana");
        palabrasLinkeadas.add("Pera");
        palabrasLinkeadas.add("Celular");
        palabrasLinkeadas.add("Laptop"); 
        palabrasLinkeadas.add("Pera"); 
        palabrasLinkeadas.add("Laptop"); 

        for (String palabra : palabrasLinkeadas) {
            System.out.println(palabra);
        }
    }

    public void construirTreeSet() {
        Set<String> palabrasTreeSet = new TreeSet<>();
        palabrasTreeSet.add("Laptop");
        palabrasTreeSet.add("Manzana");
        palabrasTreeSet.add("Pera");
        palabrasTreeSet.add("Celular");
        palabrasTreeSet.add("Laptop"); 
        palabrasTreeSet.add("Pera"); 
        palabrasTreeSet.add("Laptop"); 

        for(String palabra : palabrasTreeSet){
            System.out.println(palabra);
        }
    }

    public void construirTreeSetConComparador(boolean ascendente) {
        Comparator<String> miComparador;

        if (ascendente) {
            miComparador = new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    int result = Integer.compare(s1.length(), s2.length());
                    if (result == 0) {
                        return s1.compareTo(s2); 
                    }
                    return result; 
                }
            };
        } else {
            miComparador = new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    int result = Integer.compare(s2.length(), s1.length()); 
                    if (result == 0) {
                        return s2.compareTo(s1);  
                    }
                    return result;  
                }
            };
        }

        Set<String> palabrasTreeSet = new TreeSet<>(miComparador);
        palabrasTreeSet.add("Laptop");
        palabrasTreeSet.add("Manzana");
        palabrasTreeSet.add("Pera");
        palabrasTreeSet.add("Celular");
        palabrasTreeSet.add("Celulas"); 
        palabrasTreeSet.add("Laptop");
        palabrasTreeSet.add("Pera");
        palabrasTreeSet.add("Laptop");

        for (String palabra : palabrasTreeSet) {
            System.out.println(palabra);
        }
    }
}