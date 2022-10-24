import java.util.Scanner;

public class num5032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int c = scanner.nextInt();
        int cnt = 0;
        int sumBottle = e + f;

        while (sumBottle >= c) {
            cnt += sumBottle / c;
            sumBottle = sumBottle / c + sumBottle % c;
        }

        System.out.println(cnt);
    }
}
