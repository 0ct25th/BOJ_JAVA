import java.util.Scanner;

public class num1550 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String hex = scan.nextLine();
        int dec = Integer.parseInt(hex, 16);
        System.out.println(dec);
    }
}
