import java.util.Scanner;

public class A005 {
    public static void main(String args[]) {
        Scanner num = new Scanner(System.in);
//		t 是數列的總數
        int t, a, b, c, d;
        t = num.nextInt();
        while (t-- != 0) {
            a = num.nextInt();
            b = num.nextInt();
            c = num.nextInt();
            d = num.nextInt();
            System.out.print(a + " " + b + " " + c + " " + d + " ");
            int e = 0;
            if (d - c == b - a) {
                e = d + (c - b);
                System.out.println(e);
            } else if (d / c == b / a) {
                e = d * (c / b);
                System.out.println(e);
            }
        }
    }
}