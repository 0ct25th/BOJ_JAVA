import java.util.Scanner;

public class num21567 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();

        String sum = String.valueOf(A * B * C);
        String[] strArr = sum.split("");
        int[] intArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j <intArr.length; j++) {
                if (strArr[i].equals(String.valueOf(j)))
                    intArr[j] += 1;
            }
        }
        for (int i = 0; i < intArr.length; i++)
            System.out.println(intArr[i]);
    }
}
