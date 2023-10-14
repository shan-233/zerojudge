import java.util.Scanner;

public class A004 {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            final int num0 = scanner.nextInt();

            if (num0 % 4 != 0) {
                System.out.println("平年");
            } else if (num0 % 4 == 0 && num0 % 100 != 0) {
                System.out.println("閏年");
            } else if (num0 % 100 == 0 && num0 % 400 != 0) {
                System.out.println("平年");
            } else if (num0 % 400 == 0) {
                System.out.println("閏年");
            }

        }

    }

}