import java.util.Arrays;
import java.util.Scanner;

public class num2475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArr = new int[5];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = scanner.nextInt();
            intArr[i] *= intArr[i];
        }
        int result = Arrays.stream(intArr).sum() % 10;
        System.out.println(result);
    }
}
