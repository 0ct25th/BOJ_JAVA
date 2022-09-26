import java.util.Arrays;
import java.util.Scanner;

public class num2562 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++){
            arr[i] = scan.nextInt();
        }

        max = arr[0];
        for (int i = 1; i < arr.length; i ++) {
            if (max < arr[i]){
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index + 1);
    }
}
