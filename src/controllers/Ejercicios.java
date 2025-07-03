package controllers;

import java.util.Arrays;
import java.util.HashSet;

public class Ejercicios {
    public Ejercicios() {
        // Ejercicio 1
        System.out.println("Ejercicio 1:");
        System.out.println("Numeros: ");
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5, 4, 3, 2, 45};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("¿A tiene duplicados? " + tieneDuplicados(a));
        System.out.println("¿B tiene duplicados? " + tieneDuplicados(b));

        // Ejercicio 2
        System.out.println("\nEjercicio 2:");
        imprimirIsograma("murcielago");
        imprimirIsograma("camaleon");

        // Ejercicio 3
        System.out.println("\nEjercicio 3:");
        String texto = """
                La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?

                Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.

                En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.
                """;
        int palabrasUnicas = contarPalabrasUnicas(texto);
        System.out.println("Número de palabras únicas: " + palabrasUnicas);
    }

    // Ejercicio 1
    public boolean tieneDuplicados(int[] numeros) {
        HashSet<Integer> conjunto = new HashSet<>();
        for (int num : numeros) {
            if (!conjunto.add(num)) {
                return true;
            }
        }
        return false;
    }

    // Ejercicio 2
    public boolean esIsograma(String palabra) {
        palabra = palabra.toLowerCase();
        HashSet<Character> letras = new HashSet<>();
        for (char c : palabra.toCharArray()) {
            if (!letras.add(c)) {
                return false;
            }
        }
        return true;
    }
    public void imprimirIsograma(String palabra) {
        palabra = palabra.toLowerCase();
        HashSet<Character> letras = new HashSet<>();
        for (char c : palabra.toCharArray()) {
            if (!letras.add(c)) {
                System.out.println("La palabra: \"" + palabra + "\" es isograma?: false, letra repetida: " + c);
                return;
            }
        }
        System.out.println("La palabra: \"" + palabra + "\" es isograma?: true");
    }

    // Ejercicio 3
    public int contarPalabrasUnicas(String frase) {
    frase = frase.toLowerCase();
    String[] palabras = frase.split(" ");
    HashSet<String> conjunto = new HashSet<>();
    for (String p : palabras) {
        if (!p.isEmpty()) {
            conjunto.add(p);
        }
    }
    return conjunto.size();
}

}
