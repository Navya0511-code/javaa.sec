public class Q14LongestWord {
    public static void main(String[] args) {
        String sentence = "Java programming is interesting";
        String[] words = sentence.split("\\s+");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
    }
}
