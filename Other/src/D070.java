import java.util.Scanner;

public class D070 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            final int year = sc.nextInt();
            if (year == 0)
                break;
            else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("a leap year");
            } else {
                System.out.println("a normal year");
            }
        }
    }
}