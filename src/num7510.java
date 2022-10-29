import java.util.Arrays;
import java.util.Scanner;

public class num7510 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] triangle = new int[3];

        int T = scanner.nextInt();
        for (int i = 1; i <= T; i++) {
            triangle[0] = scanner.nextInt();
            triangle[1] = scanner.nextInt();
            triangle[2] = scanner.nextInt();

            Arrays.sort(triangle);

            System.out.println("Scenario #" + i +":");
            if ((triangle[2] * triangle[2]) == (triangle[0] * triangle[0]) + (triangle[1] * triangle[1]))
                System.out.println("yes");
            else
                System.out.println("no");
            System.out.println();
        }
    }
}
