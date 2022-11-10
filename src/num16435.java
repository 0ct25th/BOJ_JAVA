import java.util.Arrays;
import java.util.Scanner;

public class num16435 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        int[] fruitsHeight = new int[N];
        for (int i = 0; i < N; i++) {
            fruitsHeight[i] = scanner.nextInt();
        }

        Arrays.sort(fruitsHeight);
        for (int i = 0; i < N; i++) {
            if (L >= fruitsHeight[i])
                L += 1;
        }
        System.out.println(L);
    }
}
