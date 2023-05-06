import java.util.Scanner;

public class B877 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int num1 = Integer.parseInt(A);
        String B = sc.next();
        int num2 = Integer.parseInt(B);
        int ans = 0;
        if (num1 >= num2) {
            ans = 100 + num2 - num1;
            System.out.println(ans);
        } else if (num1 <= num2) {
            ans = num2 - num1;
            System.out.println(ans);
        }
    }
}