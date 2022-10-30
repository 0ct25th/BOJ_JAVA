import java.util.Scanner;

public class num10409 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int T = scanner.nextInt();
        int[] task = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            task[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            T -= task[i];
            if (T < 0)
                break;
            cnt++;
        }
        System.out.println(cnt);
    }
}
