import java.util.Arrays;
import java.util.Scanner;

public class num3040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] height = new int[9];
        int sum = 0;
        int spy1 = 0, spy2 = 0;

        // 키를 입력받아 배열에 저장
        for (int i = 0; i < height.length; i++) {
            height[i] = scanner.nextInt();
            sum += height[i];
        }

        // 브루트 포스
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (sum - height[i] - height[j] == 100) {
                    spy1 = i;
                    spy2 = j;
                    break;
                }
            }
        }

        // 출력
        for (int i = 0; i < height.length; i++) {
            if (i == spy1 || i == spy2)
                continue;
            System.out.println(height[i]);
        }
    }
}
