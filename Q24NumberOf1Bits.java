public class Q24NumberOf1Bits {
    public static void main(String[] args) {
        int n = 11;
        int count = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            }
            n = n / 2;
        }

        System.out.println("Number of 1 Bits = " + count);
    }
}
