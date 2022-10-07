import java.util.Scanner;

public class num1259 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String T;
        while (true) {
            T = scanner.next();
            if (Integer.parseInt(T) == 0) {
                break;
            }

            StringBuffer sb = new StringBuffer(T);
            String reverse = sb.reverse().toString();

            if (T.equals(reverse)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
