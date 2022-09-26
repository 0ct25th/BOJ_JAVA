import java.util.Scanner;

public class num1330 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A, B;
        A = scan.nextInt();
        B = scan.nextInt();

        if (A > B) {
            System.out.println(">");
        } else if(A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
