import java.util.LinkedHashMap;
import java.util.Map;

public class Q4ElementFrequency {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10};
        Map<Integer, Integer> frequency = new LinkedHashMap<>();

        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }
}
