import java.util.Arrays;
import java.util.Scanner;

public class num23348 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int N = scanner.nextInt();
        int maxScore = 0;
        for (int i = 0; i < N; i++) {
            int score = 0;
            for (int j = 0; j < 3; j++) {
                int team1 = scanner.nextInt();
                int team2 = scanner.nextInt();
                int team3 = scanner.nextInt();

                score += team1 * A + team2 * B + team3 * C;
            }
            if (maxScore < score)
                maxScore = score;
        }
        System.out.println(maxScore);
    }
}
