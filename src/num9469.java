import java.util.Scanner;

public class num9469 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int P = scanner.nextInt();
        for (int i = 0; i < P; i++) {
            int N = scanner.nextInt();
            double D = scanner.nextDouble();
            double A = scanner.nextDouble();
            double B = scanner.nextDouble();
            double F = scanner.nextDouble();
            String sum = String.format("%.6f", D / (A + B) * F);
            System.out.println(N + " " + sum);
        }
    }
}
