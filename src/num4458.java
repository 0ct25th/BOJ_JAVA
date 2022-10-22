import java.util.Scanner;

public class num4458 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        String str;
        String[] strArr;
        for (int i = 0; i < N; i++) {
            str = scanner.nextLine();
            strArr = new String[str.length()];
            strArr = str.split("");
            strArr[0] = strArr[0].toUpperCase();
            for (int j = 0; j < strArr.length; j++) {
                System.out.print(strArr[j]);
            }
            System.out.println();
        }
    }
}
