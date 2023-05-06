import java.util.Scanner;

public class D067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int year = Integer.parseInt(input);
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("a leap year");
        } else {
            System.out.println("a normal year");
        }
    }
}