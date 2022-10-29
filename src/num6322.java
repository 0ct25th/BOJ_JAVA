import java.util.Scanner;

public class num6322 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 1;
        while (true) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            if (a == 0 && b == 0 && c == 0)
                break;

            System.out.println("Triangle #" + cnt);
            if (a == -1) {
                if (c <= b)
                    System.out.println("Impossible.");
                else {
                    a = Math.sqrt((c * c) - (b * b));
                    System.out.println("a = " + String.format("%.3f", a));
                }
            }

            if (b == -1) {
                if (c <= a)
                    System.out.println("Impossible.");
                else {
                    b = Math.sqrt((c * c) - (a * a));
                    System.out.println("b = " + String.format("%.3f", b));
                }
            }

            if (c == -1) {
                c = Math.sqrt((a * a) + (b * b));
                System.out.println("c = " + String.format("%.3f", c));
            }
            cnt++;
            System.out.println();
        }
    }
}
