import java.util.Scanner;

public class num24267 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        String str = String.valueOf((n * (n-1) * (n-2)) / 6);
        System.out.println(str);
        System.out.println(3);
    }
}
