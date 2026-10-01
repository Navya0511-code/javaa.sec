public class Q19PrimeNumbersInRange {
    public static void main(String[] args) {
        int start = 10;
        int end = 50;
        int count = 0;

        System.out.println("Prime numbers:");
        for (int num = start; num <= end; num++) {
            if (num < 2) {
                continue;
            }

            boolean prime = true;
            for (int i = 2; i <= num / i; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(num + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println("Count: " + count);
    }
}
