import java.util.Scanner;

public class num16199 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pYear = scanner.nextInt();
        int pMonth = scanner.nextInt();
        int pDay = scanner.nextInt();

        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        int age = year - pYear;
        if (pYear == year)
            System.out.println(age);
        else {
            if (pMonth > month)
                System.out.println(age - 1);
            else if(pMonth == month) {
                if (pDay <= day)
                    System.out.println(age);
                else
                    System.out.println(age - 1);
            } else
                System.out.println(age);
        }
        System.out.println(age + 1);
        System.out.println(age);
    }
}
