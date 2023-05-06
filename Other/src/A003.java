import java.util.Scanner;

public class A003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num0 = scanner.next();
        int M = Integer.parseInt(num0);
        String num1 = scanner.next();
        int D = Integer.parseInt(num1);
        int S = 0;
        S = ((M * 2 + D) % 3);
        if (S == 0) {
            System.out.print("普通");
        } else if (S == 1) {
            System.out.print("吉");
        } else if (S == 2) {
            System.out.print("大吉");
        }
    }
}