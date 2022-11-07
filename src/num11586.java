import java.util.Scanner;

public class num11586 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char c[][] = new char[n][n];
        for(int i = 0; i < n; i++)
            c[i] = scanner.next().toCharArray();

        int k = scanner.nextInt();

        switch(k) {
            case 1 :
                for(int i = 0; i < n; i++) {
                    for(int j = 0; j < n; j++)
                        System.out.print(c[i][j]);
                    System.out.println();
                }
                break;
            case 2 :
                for(int i = 0; i < n; i++) {
                    for(int j = n-1; j >= 0; j--)
                        System.out.print(c[i][j]);
                    System.out.println();
                }
                break;
            case 3 :
                for(int i = n-1; i >= 0; i--) {
                    for(int j = 0; j < n; j++)
                        System.out.print(c[i][j]);
                    System.out.println();
                }
        }
    }
}
