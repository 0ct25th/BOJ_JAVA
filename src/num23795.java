import java.util.Scanner;

public class num23795 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int sum = 0;

        while (true) {
            n = scanner.nextInt();
            if (n != -1) {
                sum += n;
            } else {
                break;
            }
        }
        System.out.println(sum);
    }
}
