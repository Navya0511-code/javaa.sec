import java.util.LinkedHashMap;
import java.util.Map;

public class Q2FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 10, 50};
        Map<Integer, Integer> frequency = new LinkedHashMap<>();

        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        System.out.println("Duplicate elements:");
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
