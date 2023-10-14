import java.util.Scanner;

public class D069 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        int total = Integer.parseInt(input1);

        Scanner sc = new Scanner(System.in);

        while (total-- != 0) {

            String input2 = scanner.nextLine();
            int year = Integer.parseInt(input2);

            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("a leap year");
            } else {
                System.out.println("a normal year");

            }
        }

    }

}