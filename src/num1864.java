import java.util.Scanner;

public class num1864 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String N;
        while (true) {
            N = scanner.next();
            String[] strArr = N.split("");
            int[] intArr = new int[strArr.length];
            int pow = strArr.length - 1;
            int result = 0;

            // 문자열을 숫자로 치환
            for(int i = 0; i < strArr.length; i++) {
                if (strArr[i].equals("-")) {
                    intArr[i] = 0;
                } else if (strArr[i].equals("\\")) {
                    intArr[i] = 1;
                } else if (strArr[i].equals("(")) {
                    intArr[i] = 2;
                } else if (strArr[i].equals("@")) {
                    intArr[i] = 3;
                } else if (strArr[i].equals("?")) {
                    intArr[i] = 4;
                } else if (strArr[i].equals(">")) {
                    intArr[i] = 5;
                } else if (strArr[i].equals("&")) {
                    intArr[i] = 6;
                } else if (strArr[i].equals("%")) {
                    intArr[i] = 7;
                } else {
                    intArr[i] = -1;
                }
            }

            // 8진법으로 변환하기
            for (int i = 0; i < intArr.length; i++) {
                result += intArr[i] * Math.pow(8, pow);
                pow--;
            }

            // 종료 조건
            if (N.equals("#")) {
                break;
            }

            System.out.println(result);
        }
    }
}
