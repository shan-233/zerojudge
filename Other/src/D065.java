import java.util.Scanner;

public class D065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int A = Integer.parseInt(input);
        String input1 = sc.next();
        int B = Integer.parseInt(input1);
        String input2 = sc.next();
        int C = Integer.parseInt(input2);
        if (A >= B && A >= C) {
            System.out.println(A);
        } else if (B >= A && B >= C) {
            System.out.println(B);
        } else if (C >= A && C >= B) {
            System.out.println(C);
        }
    }
}