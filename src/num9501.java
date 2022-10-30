import java.util.Scanner;

public class num9501 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();      // 우주선의 개수
            double D = scanner.nextDouble();      // 목적지 까지의 거리
            int cnt = 0;

            for (int j = 0; j < N; j++) {
                double vi = scanner.nextDouble();     // 우주선의 최고 속도
                double fi = scanner.nextDouble();     // 우주선의 연료양
                double ci = scanner.nextDouble();     // 우주선의 연료 소비율

                if((D / vi) * ci <= fi)
                    cnt++;
            }
            System.out.println(cnt);
        }
    }
}
