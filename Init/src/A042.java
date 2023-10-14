import java.util.Scanner;

public class A042 {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            final int A = scanner.nextInt();

            int i = 0;
            if (A > 0) {

                i = A * A - A + 2;

            }
            System.out.println(i);
        }

    }
}