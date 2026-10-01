public class Q29AddBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        String result = "";

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result = (sum % 2) + result;
            carry = sum / 2;
        }

        System.out.println("Binary Sum = " + result);
    }
}
