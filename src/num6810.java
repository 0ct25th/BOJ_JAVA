import java.util.Scanner;

public class num6810 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int one, two, three;

        one = scan.nextInt();
        two = scan.nextInt();
        three = scan.nextInt();

        int result = 91 + + one + two * 3 + three;
        System.out.println("The 1-3-sum is "+ result);
    }
}
