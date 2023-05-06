import java.util.Scanner;

public class C382 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int ans = 0;
        while (scanner.hasNext()) {
            String num0 = scanner.next();
            int A = Integer.parseInt(num0);
            String sign = scanner.next();
            String num1 = scanner.next();
            int B = Integer.parseInt(num1);
            switch (sign) {
                case "+":
                    ans = A + B;
                    System.out.println(ans);
                    break;
                case "-":
                    ans = A - B;
                    System.out.println(ans);
                    break;
                case "*":
                    ans = A * B;
                    System.out.println(ans);
                    break;
                case "/":
                    ans = A / B;
                    System.out.println(ans);
                    break;
            }
        }
    }
}