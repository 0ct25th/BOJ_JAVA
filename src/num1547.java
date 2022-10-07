import java.util.Scanner;

public class num1547 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int M = scanner.nextInt();
        int loc = 1;        // 초기 공의 위치
        for (int i = 0; i < M; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            if (X == loc) {
                loc = Y;
            } else if (Y == loc) {
                loc = X;
            }
        }
        System.out.println(loc);
    }
}
