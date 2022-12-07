import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(14);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(4);
        set2.add(7);
        set2.add(10);


        System.out.println(symmetricDifference(set1, set2));


    }
    public static Set<Integer> symmetricDifference(Set<Integer> set1,Set<Integer> set2) {

        Set<Integer> integers = new HashSet<>(set1);
        integers.addAll(set2);
        Set<Integer> set = new HashSet<>(set1);
        set.retainAll(set2);
        integers.removeAll(set);

        return integers;
    }
}
