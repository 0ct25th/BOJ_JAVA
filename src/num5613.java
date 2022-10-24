import java.util.Scanner;

public class num5613 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;             // 결과값
        String op = null;           // 입력받을 연산자

        result = scanner.nextInt();
        while (true) {
            op = scanner.next();
            if (op.equals("="))
                break;
            else if (op.equals("+"))
                result += scanner.nextInt();
            else if (op.equals("-"))
                result -= scanner.nextInt();
            else if (op.equals("*"))
                result *= scanner.nextInt();
            else
                result /= scanner.nextInt();
        }
        System.out.println(result);
    }
}
