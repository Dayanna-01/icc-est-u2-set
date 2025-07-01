import controllers.Sets;
    
public class App {
    public static void main(String[] args) {
        Sets sets = new Sets();

        System.out.println(" HashSet ");
        System.out.println("------------");
        sets.construirHashSet();

        System.out.println("\nLinkedHashSet ");
        System.out.println("------------");
        sets.construirLinkedHashSet();

        System.out.println("\n TreeSet ");
        System.out.println("------------");
        sets.construirTreeSet();

        System.out.println("\nTreeSet con Comparator ");
        System.out.println("------------");
        sets.construirTreeSetConComparator();
    }
}
