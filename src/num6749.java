import java.util.Scanner;

public class num6749 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first, second, last;
        last = scan.nextInt();
        second = scan.nextInt();
        first = second + (second - last);

        System.out.println(first);
    }
}
