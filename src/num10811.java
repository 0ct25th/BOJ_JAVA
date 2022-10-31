import java.util.Scanner;

public class num10811 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] intArr = new int[N];
        for (int i = 0; i < N; i++) {
            intArr[i] = i + 1;
        }

        int M = scanner.nextInt();
        for (int a = 0; a < M; a++) {
            int i = scanner.nextInt() - 1;
            int j = scanner.nextInt() - 1;

            while(i < j) {
                int temp = intArr[i];
                intArr[i++] = intArr[j];
                intArr[j--] = temp;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(intArr[i] + " ");
        }
    }
}
