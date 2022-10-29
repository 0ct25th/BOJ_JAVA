public class num6376 {
    public static void main(String[] args) {
        System.out.println("n e\n" +
                "- -----------");
        System.out.println("0 1\n" +
                "1 2\n" +
                "2 2.5");

        double factorial = 2;
        double i = 2;
        double result = 2.5;

        while (factorial < 9) {
            factorial++;
            i *= factorial;
            result += 1 / i;
            System.out.printf("%.0f %.9f\n", factorial, result);
        }
    }
}
