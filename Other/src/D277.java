import java.util.Scanner;

public class D277 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.nextLine();
            final int num = Integer.parseInt(input);
            if (num % 2 == 0) {
                System.out.println(num);
            } else {
                System.out.println(num - 1);
            }
        }
    }
}