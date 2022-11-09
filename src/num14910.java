import java.util.Scanner;

public class num14910 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = scanner.nextLine().split(" ");
        String confirm = "Good";
        for (int i = 0; i < str.length - 1; i++) {
            int a = Integer.parseInt(str[i]);
            int b = Integer.parseInt(str[i + 1]);
            if (a > b) {
                confirm = "Bad";
                break;
            }
        }
        System.out.println(confirm);
    }
}
