import java.util.Scanner;

public class num5217 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            int n = scan.nextInt();
            int cnt = 0;

            System.out.print("Pairs for " + n + ": ");
            for(int i = 1; i < n; i++) {
                for(int j = 1; j < n; j++) {
                    if(i + j == n && i < j) {
                        if(cnt == 0) {
                            cnt++;
                            System.out.print(i + " " + j);
                        } else {
                            System.out.print(", " + i + " " + j);
                        }
                    }
                }
            }

            System.out.println();
        }
    }
}