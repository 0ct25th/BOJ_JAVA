import java.util.Scanner;

public class num5691 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String[] num = scanner.nextLine().split(" ");

            if (num[0].equals("0") && num[1].equals("0"))
                break;

            int A = Integer.parseInt(num[0]);
            int B = Integer.parseInt(num[1]);

            System.out.println(A - (B - A));
        }
    }
}
