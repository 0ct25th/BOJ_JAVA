import java.util.Scanner;

public class num25372 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            String str = scanner.next();
            if (str.length() >= 6 && str.length() <= 9) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
