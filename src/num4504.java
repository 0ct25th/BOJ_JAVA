import java.util.Scanner;

public class num4504 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        while (true) {
            int list = scanner.nextInt();
            if (list == 0)
                break;
            else if (list % n == 0)
                System.out.println(list + " is a multiple of " + n + ".");
            else
                System.out.println(list + " is NOT a multiple of " + n + ".");
        }
    }
}
