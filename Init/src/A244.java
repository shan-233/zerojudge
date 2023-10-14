import java.util.Scanner;

public class A244 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int A = Integer.parseInt(num);

        for (int i = 0; i < A; i++) {

            String num0 = sc.next();
            int ans1 = Integer.parseInt(num0);

            String num1 = sc.next();
            int ans2 = Integer.parseInt(num1);

            String num2 = sc.next();
            int ans3 = Integer.parseInt(num2);

            int j;

            switch (ans1) {
                case 1:
                    j = ans2 + ans3;
                    System.out.println(j);
                    break;
                case 2:
                    j = ans2 - ans3;
                    System.out.println(j);
                    break;
                case 3:
                    j = ans2 * ans3;
                    System.out.println(j);
                    break;
                case 4:
                    j = ans2 / ans3;
                    System.out.println(j);
                    break;
            }
        }
    }
}