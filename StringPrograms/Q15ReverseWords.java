public class Q15ReverseWords {
    public static void main(String[] args) {
        String sentence = "Java is powerful";
        String[] words = sentence.trim().split("\\s+");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
    }
}
