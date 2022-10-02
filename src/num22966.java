import java.util.Arrays;
import java.util.Scanner;

public class num22966 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String[] title = new String[T];
        int[] level = new int[T];

        for (int i = 0; i < T; i++) {
            title[i] = scanner.next();
            level[i] = scanner.nextInt();
        }

        int min = level[0];
        for(int i : level) {
            if(i < min) {
                min = i;
            }
        }

        int index = 0;
        for(int i = 0; i < level.length; i++) {
            if (level[i] == min){
                index = i;
                break;
            }
        }
        System.out.println(title[index]);
    }
}
