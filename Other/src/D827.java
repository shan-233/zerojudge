import java.util.Scanner;

public class D827 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String num = sc.nextLine();
            int A = Integer.parseInt(num);
            int i = 0;
            i = A / 12;
            int j = 0;
            j = A - (12 * i);
            int k = 0;
            k = (j * 5) + (50 * i);
            System.out.println(k);
        }
    }
}