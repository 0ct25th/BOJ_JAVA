import java.util.Scanner;

public class num25191 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt() / 2;
        int B = scanner.nextInt();

        int beverage = A + B;
        System.out.println(N > beverage ? beverage:N);
    }
}
