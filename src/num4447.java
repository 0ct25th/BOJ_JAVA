import java.util.Scanner;

public class num4447 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        String str;
        String[] strArr;
        int gCnt, bCnt;
        for (int i = 0; i < N; i++) {
            gCnt = 0;
            bCnt = 0;
            str = scanner.nextLine();
            String copy = str;
            strArr = new String[str.length()];
            strArr = str.toLowerCase().split("");
            // 문자열에서 g와 b 숫자 카운트
            for (int j = 0; j < strArr.length; j++) {
                if (strArr[j].equals("g"))
                    gCnt++;
                else if (strArr[j].equals("b"))
                    bCnt++;
            }

            // 문자열 출력
            strArr = copy.split("");
            for (int j = 0; j < strArr.length; j++) {
                System.out.print(strArr[j]);
            }

            if (gCnt > bCnt)
                System.out.println(" is GOOD");
            else if (gCnt < bCnt)
                System.out.println(" is A BADDY");
            else
                System.out.println(" is NEUTRAL");
        }
    }
}
