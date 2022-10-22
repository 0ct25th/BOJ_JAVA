import java.util.Scanner;

public class num4470 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        String str;
        for (int i = 1; i < N + 1; i++) {
            str = scanner.nextLine();
            System.out.println(i + ". " + str);
        }
    }
}
