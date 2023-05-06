import java.util.Scanner;

public class C379 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        int num = Integer.parseInt(A);
        int i = 0;
        i = num / 10 * 3;
        System.out.println(i);
    }
}