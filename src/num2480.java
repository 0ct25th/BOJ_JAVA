import java.util.Arrays;
import java.util.Scanner;

public class num2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArr = new int[3];
        int result = 0;

        // 2차원 배열로 입력 받기
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = scanner.nextInt();
        }

        // 상금 계산
        if (intArr[0] == intArr[1] && intArr[0] == intArr[2])
            result = 10000 + intArr[0] * 1000;
        else if (intArr[0] == intArr[1] || intArr[0] == intArr[2] || intArr[1] == intArr[2])
            result = 1000 + 100 * (intArr[0] == intArr[1] ? intArr[0] : intArr[2]);
        else {
            if (intArr[0] > intArr[1] && intArr[0] > intArr[2])
                result = intArr[0] * 100;
            else if (intArr[1] > intArr[0] && intArr[1] > intArr[2])
                result = intArr[1] * 100;
            else
                result = intArr[2] * 100;
        }


        System.out.println(result);
    }
}
