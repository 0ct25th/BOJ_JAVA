import java.util.Arrays;
import java.util.Scanner;

public class num10817 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        int[] arr = {A, B, C};
        Arrays.sort(arr);
        System.out.println(arr[1]);

    }
}
