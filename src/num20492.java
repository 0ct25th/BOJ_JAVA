import java.util.Scanner;

public class num20492 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        int result1 = (int) (N * 0.78);
        int result2 = (int) ((N * 0.8) + ((N - N * 0.8) * 0.78));

        System.out.println(result1 + " " + result2);
    }
}
