import java.util.LinkedHashSet;
import java.util.Set;

public class Q3RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40};
        Set<Integer> unique = new LinkedHashSet<>();

        for (int num : arr) {
            unique.add(num);
        }

        System.out.println("Array after removing duplicates:");
        for (int num : unique) {
            System.out.print(num + " ");
        }
    }
}
