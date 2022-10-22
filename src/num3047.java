import java.util.Arrays;
import java.util.Scanner;

public class num3047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 숫자 입력받기
        int[] intArr = new int[3];
        for (int i = 0; i < 3; i++) {
            intArr[i] = scanner.nextInt();
        }
        Arrays.sort(intArr);

        // 문자열 입력받기
        String str = scanner.next();
        for (int i = 0; i < intArr.length; i++) {
            if ('A' == str.charAt(i))
                System.out.print(intArr[0] + " ");
            else if ('B' == str.charAt(i))
                System.out.print(intArr[1] + " ");
            else
                System.out.print(intArr[2] + " ");
        }
    }
}
