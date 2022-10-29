import java.util.Scanner;

public class num5988 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        if (N != 0) {
            for (int i = 0; i < N; i++) {
                String[] arr = scanner.next().split("");
                System.out.println(Integer.parseInt(arr[arr.length - 1]) % 2 == 0 ? "even" : "odd");
            }
        }
    }
}
