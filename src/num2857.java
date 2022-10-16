import java.util.Scanner;

public class num2857 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] agent = new String[5];
        int cnt = 0;

        // 요원 이름 5명 입력받기
        for (int i = 0; i < agent.length; i++) {
            agent[i] = scanner.next();
        }

        // 이름에 FBI있는지 확인하기
        for (int i = 0; i < agent.length; i++) {
            if (agent[i].contains("FBI")) {
                System.out.print(i+1 + " ");
                cnt++;
            }
        }

        if (cnt == 0)
            System.out.println("HE GOT AWAY!");


    }
}
