import java.util.Scanner;

public class num10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] A = new int[N];
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
            if (A[i] < X)
                result[i] = A[i];
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0)
                System.out.print(result[i] + " ");
        }
    }
}
