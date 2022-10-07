import java.util.Scanner;

public class num1731 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        if((arr[1] - arr[0]) == (arr[2] - arr[1])) {
            int an = arr[1] - arr[0];       // 등차
            System.out.println(arr[N-1] + an);
        } else {
            int an = arr[1] / arr[0];       // 등비
            System.out.println(arr[N-1] * an);
        }
    }
}
