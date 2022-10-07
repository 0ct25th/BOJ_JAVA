import java.util.Scanner;

public class num1568 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();      // 새의 수
        int K = 1;
        int cnt = 0;
        while (N != 0) {
            N -= K;
            K ++;
            cnt ++;
            if(N < K){
                K = 1;
            }
        }
        System.out.println(cnt);
    }
}
