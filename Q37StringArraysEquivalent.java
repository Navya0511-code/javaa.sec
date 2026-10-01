public class Q37StringArraysEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        String s1 = "";
        String s2 = "";

        for (String s : word1) {
            s1 += s;
        }

        for (String s : word2) {
            s2 += s;
        }

        if (s1.equals(s2)) {
            System.out.println("Equivalent");
        } else {
            System.out.println("Not Equivalent");
        }
    }
}
