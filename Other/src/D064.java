import java.util.Scanner;

public class D064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int ans = Integer.parseInt(input);
        if (ans % 2 == 0) {
            System.out.println("Even");
        } else if (ans % 2 == 1) {
            System.out.println("Odd");
        }
    }
}