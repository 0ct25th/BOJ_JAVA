import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num2947 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().split(" ");
        int [] intArr = new int[5];
        for(int i = 0; i < 5; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        while (true) {
            if (intArr[0] == 1 && intArr[1] == 2 && intArr[2] == 3 && intArr[3] == 4 && intArr[4] == 5) 
                break;
            
            for (int i = 0; i < 4; i++) {
                if (intArr[i] > intArr[i + 1]) {
                    int temp = intArr[i];
                    intArr[i] = intArr[i + 1];
                    intArr[i + 1] = temp;
                    // 출력
                    for (int j = 0; j < 5; j++){
                        System.out.print(intArr[j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
