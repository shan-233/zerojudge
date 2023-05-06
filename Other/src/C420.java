import java.util.Scanner;

public class C420 {
    public static void main(String[] args) {
        int i, j, k, p, n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++)
                System.out.print("_");
            for (k = 1; k <= 2 * i - 1; k++)
                System.out.print("*");
            for (p = 1; p <= n - i; p++)
                System.out.printf("_");
            System.out.println("");
        }
    }
}