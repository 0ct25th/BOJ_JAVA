import java.util.Scanner;

public class num5597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] student = new int[31];

        for(int i = 1; i < 29; i++) {
            int num = scanner.nextInt();
            student[num] = 1;
        }
        for(int i = 1; i < student.length; i++) {
            if(student[i] != 1)
                System.out.println(i);
        }
    }
}
