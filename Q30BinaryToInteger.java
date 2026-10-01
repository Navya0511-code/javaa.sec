public class Q30BinaryToInteger {
    public static void main(String[] args) {
        String binary = "1011";
        int decimal = 0;

        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal * 2 + (binary.charAt(i) - '0');
        }

        System.out.println("Binary Number = " + binary);
        System.out.println("Decimal Number = " + decimal);
    }
}
