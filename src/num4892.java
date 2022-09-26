import java.util.Scanner;

public class num4892 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n0;
        int cnt = 0;

        while(true){
            n0 = scan.nextInt();
            cnt += 1;
            if (n0 == 0){
                break;
            }

            int n1, n2, n3, n4;
            String str;
            n1 = 3 * n0;
            if (n1 % 2 == 0) {
                n2 = n1 / 2;
                str = "even";
            } else {
                n2 = (n1 + 1) / 2;
                str = "odd";
            }
            n3 = 3 * n2;
            n4 = n3 / 9;

            System.out.println(cnt + ". " + str + " " + n4);
        }
    }
}
