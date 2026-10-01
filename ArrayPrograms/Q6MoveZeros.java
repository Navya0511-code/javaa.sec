public class Q6MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 8, 0, 2};
        int index = 0;

        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
