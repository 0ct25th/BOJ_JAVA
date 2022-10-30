import java.util.Scanner;

public class num10102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        String[] vote = scanner.next().split("");
        int cntA = 0, cntB = 0;
        for (int i = 0; i < vote.length; i++) {
            if (vote[i].equals("A"))
                cntA++;
            else
                cntB++;
        }

        if (cntA > cntB)
            System.out.println("A");
        else if (cntA < cntB)
            System.out.println("B");
        else
            System.out.println("Tie");

    }
}
