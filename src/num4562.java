import java.util.Scanner;

public class num4562 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int X, Y;

        for (int i = 0; i < N; i++){
            X = scan.nextInt();
            Y = scan.nextInt();

            if (X < Y){
                System.out.println("NO BRAINS");
            } else {
                System.out.println("MMM BRAINS");
            }
        }
    }
}
