import java.util.Scanner;

public class num4493 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String p1, p2;
        int p1Cnt, p2Cnt;
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            p1Cnt = 0;
            p2Cnt = 0;
            int n = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                p1 = scanner.next();
                p2 = scanner.next();
                if (p1.equals("R") && p2.equals("S"))
                    p1Cnt++;
                else if (p1.equals("R") && p2.equals("P"))
                    p2Cnt++;

                if (p1.equals("S") && p2.equals("P"))
                    p1Cnt++;
                else if (p1.equals("S") && p2.equals("R"))
                    p2Cnt++;

                if (p1.equals("P") && p2.equals("R"))
                    p1Cnt++;
                else if (p1.equals("P") && p2.equals("S"))
                    p2Cnt++;
            }

            if (p1Cnt > p2Cnt)
                System.out.println("Player 1");
            else if (p1Cnt < p2Cnt)
                System.out.println("Player 2");
            else
                System.out.println("TIE");
        }
    }
}
