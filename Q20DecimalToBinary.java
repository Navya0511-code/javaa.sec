public class Q20DecimalToBinary {
    public static void main(String[] args) {
        int num = 25;

        if (num == 0) {
            System.out.println("Binary: 0");
            return;
        }

        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }

        System.out.println("Binary: " + binary);
    }
}
