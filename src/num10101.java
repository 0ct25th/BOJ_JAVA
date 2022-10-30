import java.util.Scanner;

public class num10101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && b == c)
            System.out.println("Equilateral");
        else if ((a + b + c) == 180 && ((a == b) || (b == c) || (a == c)))
            System.out.println("Isosceles");
        else if ((a + b + c) != 180)
            System.out.println("Error");
        else
            System.out.println("Scalene");
    }
}
