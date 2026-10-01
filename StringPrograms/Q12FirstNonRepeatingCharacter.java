public class Q12FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == current) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("First non-repeating character: " + current);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character found");
        }
    }
}
