import java.util.Scanner;

public class A053 {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            String input = scanner.nextLine();
            final int ans = Integer.parseInt(input);

            if (ans <= 10) {
                int All = 0;
                All = ans * 6;
                System.out.println(All);
            } else if (ans >= 11 && ans <= 20) {
                int All1 = 0;
                All1 = 60 + ((ans - 10) * 2);
                System.out.println(All1);
            } else if (ans >= 21 && ans < 40) {
                int All2 = 0;
                All2 = 80 + ((ans - 20) * 1);
                System.out.println(All2);
            } else if (ans >= 40) {
                System.out.println(100);
            }
        }

    }

}