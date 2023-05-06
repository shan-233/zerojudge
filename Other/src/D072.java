import java.util.Scanner;

public class D072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        int total = Integer.parseInt(input1);
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (total-- != 0) {
            i++;
            String input2 = scanner.nextLine();
            int year = Integer.parseInt(input2);
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Case " + i + ": a leap year");
            } else {
                System.out.println("Case " + i + ": a normal year");
            }
        }
    }
}