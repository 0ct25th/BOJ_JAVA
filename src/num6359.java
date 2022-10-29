import java.util.Scanner;

public class num6359 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int n;      // 방의 개수
        int[] rooms;
        for (int i = 0; i < T; i++) {
            n = scanner.nextInt();
            rooms = new int[n + 1];
            for (int j = 1; j <= n; j++){
                for (int k = 1; j * k <= n; k++) {
                    if (rooms[j * k] != 0)
                        rooms[j * k] = 0;
                    else
                        rooms[j * k] = 1;
                }
            }
            int result = 0;
            for (int j = 1; j <= n; j++)
                result += rooms[j];
            System.out.println(result);
        }
    }
}
