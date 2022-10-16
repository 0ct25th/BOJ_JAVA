import java.util.*;

public class num2822 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] score = new int[8][2];

        for (int i = 0; i < 8; i++) {
            int n = scanner.nextInt();
            score[i][0] = n;
            score[i][1] = i + 1;
        }
        Arrays.sort(score, Comparator.comparing(i -> i[0], Comparator.reverseOrder()));
        int sum = 0;
        int[] index = new int[5];
        for (int i = 0; i < 5; i++) {
            sum += score[i][0];
            index[i] = score[i][1];
        }
        System.out.println(sum);
        Arrays.sort(index);
        for (int i: index)
            System.out.print(i + " ");

    }
}
