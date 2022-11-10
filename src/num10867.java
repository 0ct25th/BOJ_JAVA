import java.util.*;

public class num10867 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        HashSet<Integer> hash = new HashSet<Integer>();
        for (int i = 0; i < N; i++)
            hash.add(scanner.nextInt());

        ArrayList<Integer> arr = new ArrayList<Integer>(hash);
        Collections.sort(arr);

        for (Integer i: arr)
            System.out.print(i + " ");

    }
}
