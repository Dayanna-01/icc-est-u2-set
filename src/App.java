import controllers.Sets;

public class App {
    public static void main(String[] args) throws Exception {
        Sets sets = new Sets();

        runHashSet(sets);
        runLinkedHashSet(sets);
        construirTreeSet(sets);
        construirTreeSetConComparador(sets, true);  // Ascendente
        construirTreeSetConComparador(sets, false); // Descendente
    }

    public static void runHashSet(Sets sets) {
        System.out.println("-----------HashSet----------");
        System.out.println("ELEMENTOS DEL HASHSET(NO SE GARANTIZA EL ORDEN");
        sets.construirHashSet();  
    }

    public static void runLinkedHashSet(Sets sets) {
        System.out.println("-----------LinkedHashSet----------");
        System.out.println("ELEMENTOS DEL LINKEDHASHSET(SE GARANTIZA EL ORDEN DE INSERCION)");
        sets.construirLinkedHashSet();  
    }

    public static void construirTreeSet(Sets sets) {
        System.out.println("-----------TreeSet----------");
        System.out.println("ELEMENTOS DEL TREESET (ORDEN ASCENDENTE)");
        sets.construirTreeSet(); 
    }

    public static void construirTreeSetConComparador(Sets sets, boolean ascendente) {
        System.out.println("-----------TreeSet Con Comparador----------");
        if (ascendente) {
            System.out.println("ELEMENTOS DEL TREESET CON COMPARADOR ASCENDENTE (ORDEN POR LONGITUD Y ALFABÉTICO)");
        } else {
            System.out.println("ELEMENTOS DEL TREESET CON COMPARADOR DESCENDENTE (ORDEN POR LONGITUD Y ALFABÉTICO)");
        }
        sets.construirTreeSetConComparador(ascendente);
    }
}