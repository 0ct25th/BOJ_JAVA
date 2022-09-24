import java.util.Scanner;

public class num10430 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int a, b, c;
        a = userInput.nextInt();
        b = userInput.nextInt();
        c = userInput.nextInt();
        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
    }
}
