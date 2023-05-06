import java.util.Scanner;

public class C419 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        int num = Integer.parseInt(A);
        for (int i = 0; i < num; i++) {
            for (int j = (num - 1); j > i; j--) {
                System.out.print("_");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}