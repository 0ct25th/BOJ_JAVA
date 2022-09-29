import java.util.Scanner;

public class num9713 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++){
            int sum = 0;
            int n = scan.nextInt();
            for (int j = 1; j <= n; j++){
                if (j % 2 != 0){
                    sum += j;
                }
            }
            System.out.println(sum);
        }
    }
}
