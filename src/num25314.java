import java.util.Scanner;

public class num25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int cnt = N / 4;

        for (int i = 0; i < cnt; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
