import java.util.Scanner;

public class D063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int ans = Integer.parseInt(input);
        if (ans == 0) {
            System.out.println("1");
        } else if (ans == 1) {
            System.out.println("0");
        }
    }
}