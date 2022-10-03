import java.util.Scanner;

public class num25238 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double ignore = b * (a * 0.01);

        if (a - ignore >= 100) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}
