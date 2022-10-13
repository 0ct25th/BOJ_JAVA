import java.util.Scanner;

public class num2490 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] y = new int[4];

        for (int i = 0; i < 3; i++) {
            int zero = 0;
            int one = 0;

            for (int j = 0; j < y.length; j++) {
                y[j] = scanner.nextInt();
                if (y[j] == 0) {
                    zero++;
                } else {
                    one++;
                }
            }

            if (zero == 1 && one == 3) {
                System.out.println("A");
            } else if (zero == 2 && one == 2) {
                System.out.println("B");
            } else if (zero == 3 && one == 1) {
                System.out.println("C");
            } else if (zero == 4 && one == 0) {
                System.out.println("D");
            } else {
                System.out.println("E");
            }
        }
    }
}
