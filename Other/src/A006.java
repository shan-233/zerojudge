import java.util.Scanner;

public class A006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int ans = b * b - 4 * a * c;
            if (ans > 0) {
                System.out.println("Two different roots x1=" + (int) ((-b + (Math.sqrt(ans))) / (2 * a)) + " , x2="
                        + (int) ((-b - (Math.sqrt(ans))) / (2 * a)));
            } else if (ans == 0) {
                System.out.println("Two same roots x=" + -1 * (b / (2 * a)));
            } else {
                System.out.println("No real root");
            }
        }
    }
}