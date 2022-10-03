import java.util.Scanner;

public class num23037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String[] strArr = str.split("");
        int [] intArr = new int[5];

        for (int i = 0; i < 5; i++) {
            int change = Integer.parseInt(strArr[i]);
            intArr[i] = (int) Math.pow(change, 5);
        }

        int sum = 0;
        for(int i: intArr) {
            sum += i;
        }
        System.out.println(sum);
    }
}
