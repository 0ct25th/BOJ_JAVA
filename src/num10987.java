import java.util.Scanner;

public class num10987 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strArr = {"a", "e", "i", "o", "u"};
        int cnt = 0;
        String word = scanner.next();
        String[] wordArr = word.split("");
        for (int i = 0; i < wordArr.length; i++) {
            for (int j =0; j < strArr.length; j++) {
                if (wordArr[i].equals(strArr[j]))
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}
