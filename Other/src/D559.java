import java.util.Scanner;

public class D559 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.nextLine();
            final int ans = Integer.parseInt(input);
            System.out.println("'C' can use printf(\"%d\",n); to show integer like " + ans);
        }
    }
}