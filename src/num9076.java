import java.util.Arrays;
import java.util.Scanner;

public class num9076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int[] score = new int[5];
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 5; j++){
                score[j] = scanner.nextInt();
            }
            Arrays.sort(score);
            if (score[3] - score[1] >= 4)
                System.out.println("KIN");
            else
                System.out.println(score[1] + score[2] + score[3]);
        }
    }
}
