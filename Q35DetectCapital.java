public class Q35DetectCapital {
    public static void main(String[] args) {
        String word = "USA";

        if (word.equals(word.toUpperCase()) ||
            word.equals(word.toLowerCase()) ||
            (Character.isUpperCase(word.charAt(0)) &&
            word.substring(1).equals(word.substring(1).toLowerCase()))) {
            System.out.println("Valid Capital Usage");
        } else {
            System.out.println("Invalid Capital Usage");
        }
    }
}
