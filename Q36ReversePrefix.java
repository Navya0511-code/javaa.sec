public class Q36ReversePrefix {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        int index = word.indexOf(ch);

        if (index != -1) {
            String prefix = new StringBuilder(word.substring(0, index + 1)).reverse().toString();
            String result = prefix + word.substring(index + 1);
            System.out.println(result);
        } else {
            System.out.println(word);
        }
    }
}
