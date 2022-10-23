import java.util.Scanner;

public class num4880 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a1 = scanner.nextInt();
            int a2 = scanner.nextInt();
            int a3 = scanner.nextInt();
            int n = a2 - a1;
            int m = a3 - a2;

            if (a1 == 0 && a2 == 0 && a3 == 0)
                break;
            else if (n == m) {
                int result = a3 + m;
                System.out.println("AP " + result);
            } else {
                int result = a3 + (m * (m / n));
                System.out.println("GP " + result);
            }

        }
    }
}
