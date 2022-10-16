import java.util.Scanner;

public class num2798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int result = 0;

        int[] card = new int[N];
        for (int i = 0; i < N; i++) {
            card[i] = scanner.nextInt();
        }

        for (int i = 0; i < N - 2; i++) {
            if (card[i] > M) {
                continue;
            }
            for (int j = i + 1; j < N - 1; j++) {
                if (card[i] + card[j] > M) {
                    continue;
                }
                for (int k = j + 1; k < N; k++) {
                    int temp = card[i] + card[j] +card[k];

                    if (result < temp && temp <= M){
                        result = temp;
                    }
                } // end of for_k
            } // end of for_j
        } // end of for_i

        System.out.println(result);
    }
}
