import java.util.Scanner;

public class A044 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            final int A = scanner.nextInt();
            int i = 0;
            int j = 0;
            int k = 0;
            int l = 0;
            if (A > 0) {
                i = A * A * A;
                j = 5 * A + 6;
                k = i + j;
                l = k / 6;
            }
            System.out.println(l);
        }
    }
}