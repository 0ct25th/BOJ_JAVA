import java.util.Arrays;
import java.util.Scanner;

public class num25024 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int T=scanner.nextInt();
        int a, b;
        String tcheck, dcheck;

        String[] Array1= {"4", "6", "9", "11"};
        String[] Array2= {"1", "3", "5", "7", "8", "10", "12"};

        for(int i=0;i<T;i++) {
            tcheck = "No";
            dcheck = "No";
            a = scanner.nextInt();
            b = scanner.nextInt();

            if(0 <= a && a <= 23 && 0 <= b && b <= 59)
                tcheck = "Yes";

            if(1 <= a && a <= 12 && b >= 1){
                if(a == 2 && b <= 29)
                    dcheck = "Yes";
                else if(Arrays.asList(Array1).contains(String.valueOf(a)) && b <= 30)
                    dcheck = "Yes";
                else if(Arrays.asList(Array2).contains(String.valueOf(a)) && b <= 31)
                    dcheck = "Yes";
            }
            System.out.println(tcheck + " " + dcheck);
        }
    }
}
