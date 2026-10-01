public class Q26NumberOfSteps {
    public static void main(String[] args) {
        int num = 14;
        int steps = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            steps++;
        }

        System.out.println("Number of Steps = " + steps);
    }
}
