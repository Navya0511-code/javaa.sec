import java.util.Arrays;

public class Q11Anagrams {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        char[] first = s1.toLowerCase().toCharArray();
        char[] second = s2.toLowerCase().toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);

        if (Arrays.equals(first, second)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram");
        }
    }
}
