import java.util.Arrays;
import java.util.Scanner;

public class num2476 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] intArr = new int[N][3];

        // 2차원 배열로 입력 받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                intArr[i][j] = scanner.nextInt();
            }
        }

        int[] prize = new int[N];
        // 상금 계산
        for (int i = 0; i < N; i++) {
            if (intArr[i][0] == intArr[i][1] && intArr[i][0] == intArr[i][2]) {
                prize[i] = 10000 + intArr[i][0] * 1000;
            } else if (intArr[i][0] == intArr[i][1] || intArr[i][0] == intArr[i][2] || intArr[i][1] == intArr[i][2]) {
                prize[i] = 1000 + 100 * (intArr[i][0] == intArr[i][1] ? intArr[i][0] : intArr[i][2]);
            } else {
                if(intArr[i][0] > intArr[i][1] && intArr[i][0] > intArr[i][2])
                    prize[i] = intArr[i][0] * 100;
                else if(intArr[i][1] > intArr[i][0] && intArr[i][1] > intArr[i][2])
                    prize[i] = intArr[i][1] * 100;
                else
                    prize[i] = intArr[i][2] * 100;
            }
        }

        System.out.println(Arrays.stream(prize).max().getAsInt());


    }
}
