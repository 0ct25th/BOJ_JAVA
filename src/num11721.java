import java.util.Scanner;

public class num11721 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "";
        String[] input = scanner.next().split("");
        for (int i = 1; i <= input.length; i++) {
            System.out.print(input[i - 1]);
            if (i % 10 == 0)
                System.out.println();
        }
    }
}
