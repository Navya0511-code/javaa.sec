public class Q13RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (result.indexOf(current) == -1) {
                result += current;
            }
        }

        System.out.println(result);
    }
}
