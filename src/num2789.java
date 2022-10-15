import java.util.Scanner;

public class num2789 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] strArr = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            strArr[i] = String.valueOf(str.charAt(i));
        }

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("C")) {
                strArr[i] = "";
            } else if (strArr[i].equals("A")) {
                strArr[i] = "";
            } else if (strArr[i].equals("M")) {
                strArr[i] = "";
            } else if (strArr[i].equals("B")) {
                strArr[i] = "";
            } else if (strArr[i].equals("R")) {
                strArr[i] = "";
            } else if (strArr[i].equals("I")) {
                strArr[i] = "";
            } else if (strArr[i].equals("D")) {
                strArr[i] = "";
            } else if (strArr[i].equals("G")) {
                strArr[i] = "";
            } else if (strArr[i].equals("E")) {
                strArr[i] = "";
            }
        }

        String mod = "";
        for (int i = 0; i < strArr.length; i++) {
            mod += strArr[i];
        }

        System.out.println(mod);
    }
}
