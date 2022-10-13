import java.util.Scanner;

public class num2386 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String word = scanner.next();
            String str = scanner.nextLine();
            str = str.toLowerCase();
            str = str.trim();
            String[] strArr = str.split("");
            int cnt = 0;

            // 종료 조건
            if (word.equals("#"))
                break;

            for(int i = 0; i < strArr.length; i++) {
                if (strArr[i].equals(word))
                    cnt++;
            }

            System.out.println(word + " " + cnt);
        }
    }
}
