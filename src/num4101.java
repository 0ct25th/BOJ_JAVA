import java.util.Scanner;

public class num4101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int one , two;
        while(true) {
            one = scan.nextInt();
            two = scan.nextInt();
            if(one == two && one == 0) {
                break;
            }

            if(one > two){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
