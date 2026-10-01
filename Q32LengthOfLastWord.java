public class Q32LengthOfLastWord {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.trim().split(" ");
        System.out.println("Length of Last Word = " + words[words.length - 1].length());
    }
}
