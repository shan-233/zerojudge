import java.util.Scanner;

public class A738 {

    public static void main(String[] args) {

        final Scanner input = new Scanner(System.in);

        while (input.hasNext()) {

            final String num = input.next();
            int A = Integer.parseInt(num);

            final String num1 = input.next();
            int B = Integer.parseInt(num1);

            int C = 0;
            C = A % B;
            while (C != 0) {
                A = B;
                B = C;
                C = A % B;
            }
            if (C == 0) {
                System.out.println(B);
            }
        }
    }
}