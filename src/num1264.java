import java.util.Scanner;

public class num1264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String T;
        while(true) {
            int cnt = 0;
            T = scanner.nextLine();
            if (T.equals("#")) {
                break;
            }

            T = T.toLowerCase();
            String[] arr = T.split("");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o") || arr[i].equals("u")){
                    cnt += 1;
                }
            }

            System.out.println(cnt);
        }
    }
}
