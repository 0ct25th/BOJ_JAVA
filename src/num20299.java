import java.util.Scanner;

public class num20299 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int L = scanner.nextInt();

        StringBuilder vipClub = new StringBuilder();
        int[][] team = new int[N][3];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                team[i][j] = scanner.nextInt();
            }

            int sum = team[i][0] + team[i][1] + team[i][2];
            boolean confirm = true;
            for (int j = 0; j < 3; j++) {
                if (team[i][j] < L)
                    confirm = false;
            }
            if (sum >= K && confirm) {
                for (int j = 0; j < 3; j++) {
                    vipClub.append(team[i][j] + " ");
                }
                cnt++;
            }
        }
        System.out.println(cnt);
        System.out.println(vipClub);
    }
}
