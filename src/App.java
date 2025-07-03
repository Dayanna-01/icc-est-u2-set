import controllers.ContactoController;
import controllers.Ejercicios;
import controllers.Sets;

public class App {
    public static void main(String[] args) throws Exception {
        Sets sets = new Sets();

        runHashSet(sets);
        runLinkedHashSet(sets);
        construirTreeSet(sets);
        construirTreeSetConComparador(sets, true);  // Ascendente
        construirTreeSetConComparador(sets, false); // Descendente

        System.out.println("\n----------- Dos listados: apellido-nombre y apellido-nombre-teléfono descendente -----------");
        ContactoController contactoController = new ContactoController();

        System.out.println("\n----------- Ejercicios-----------");
        Ejercicios ejercicios = new Ejercicios();
    }

    public static void runHashSet(Sets sets) {
        System.out.println("\n----------- HashSet -----------");
        System.out.println("ELEMENTOS DEL HASHSET (NO SE GARANTIZA EL ORDEN)");
        sets.construirHashSet();  
    }

    public static void runLinkedHashSet(Sets sets) {
        System.out.println("\n----------- LinkedHashSet -----------");
        System.out.println("ELEMENTOS DEL LINKEDHASHSET (SE GARANTIZA EL ORDEN DE INSERCIÓN)");
        sets.construirLinkedHashSet();  
    }

    public static void construirTreeSet(Sets sets) {
        System.out.println("\n----------- TreeSet -----------");
        System.out.println("ELEMENTOS DEL TREESET (ORDEN ASCENDENTE ALFABÉTICO)");
        sets.construirTreeSet(); 
    }

    public static void construirTreeSetConComparador(Sets sets, boolean ascendente) {
        System.out.println("\n----------- TreeSet con Comparador -----------");
        if (ascendente) {
            System.out.println("ELEMENTOS DEL TREESET CON COMPARADOR ASCENDENTE (ORDEN POR LONGITUD Y ALFABÉTICO)");
        } else {
            System.out.println("ELEMENTOS DEL TREESET CON COMPARADOR DESCENDENTE (ORDEN POR LONGITUD Y ALFABÉTICO INVERSO)");
        }
        sets.construirTreeSetConComparador(ascendente);
    }

}
