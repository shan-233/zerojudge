import java.util.Scanner;

public class A147 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (scanner.hasNext()) {
            String A = scanner.nextLine();
            final int num = Integer.parseInt(A);

            for (i = 1; i < num; i++)
                if (i % 7 != 0) {
                    System.out.print(i + " ");

                }
            System.out.println("");
        }
    }
}