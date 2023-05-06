import java.util.Scanner;

public class A002 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String A = scanner1.next();
        int num0 = Integer.parseInt(A);
        String B = scanner1.next();
        int num1 = Integer.parseInt(B);
        int all = 0;
        all = num0 + num1;
        System.out.print(all);
    }
}