import java.util.Locale;
import java.util.Scanner;

public class num2966 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();                  // N 문제 수
        String q = scanner.next().toUpperCase();    // 문제 정답
        char[] Adrian = {'A','B','C','A','B','C','A','B','C','A','B','C'};
        char[] Bruno = {'B','A','B','C','B','A','B','C','B','A','B','C'};
        char[] Goran = {'C','C','A','A','B','B','C','C','A','A','B','B'};

        int max = 0, num = 0;
        int adrian = 0, bruno = 0, goran = 0;       // 사람마다 카운트

        for (int i = 0; i < q.length(); i++) {
            if (num % 12 == 0)
                num = 0;        // 배열의 길이가 12이기 때문

            if(q.charAt(i) == Adrian[num])
                adrian++;
            if(q.charAt(i) == Bruno[num])
                bruno++;
            if(q.charAt(i) == Goran[num])
                goran++;

            num ++;
        }

        // 최대 몇 문제 맞췄는지
        int[] cnt = {adrian, bruno, goran};
        for (int i = 0; i < cnt.length; i++) {
            if (max < cnt[i])
                max = cnt[i];
        }
        System.out.println(max);

        // ID 출력
        for (int i = 0; i < 3; i++) {
            if (cnt[i] == max) {
                switch (i) {
                    case 0:
                        System.out.println("Adrian");
                        break;
                    case 1:
                        System.out.println("Bruno");
                        break;
                    case 2:
                        System.out.println("Goran");
                        break;
                }
            }
        }
    }
}
