import java.util.Scanner;

public class num2355 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        long B = scanner.nextLong();

        // A가 B보다 항상 크다는 보장 없음
        if (A > B) {
            long tmp = 0;
            tmp = A;
            A = B;
            B = tmp;
        }

        long sum = (A + B) * (B - A + 1) / 2;

        System.out.println(sum);
    }
}
