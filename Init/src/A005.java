import java.util.Scanner;

public class A005 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int A = Integer.parseInt(num);
        String result = "";
        int i = 0;
        if (0 <= A && A <= 20) {

            while (i < A) {
                i++;

                Scanner scanner1 = new Scanner(System.in);
                String num0 = scanner1.nextLine();
                String[] All = num0.split(" ");

                int B = Integer.parseInt(All[0]);
                int C = Integer.parseInt(All[1]);
                int D = Integer.parseInt(All[2]);
                int E = Integer.parseInt(All[3]);

                if (B < 105 && C < 105 && D < 105 && E < 105) {

                    int F = 0;
                    if (E - D == C - B) {
                        F = E + (D - C);
                    } else if (E / D == C / B) {
                        F = E * (C / B);
                    }
                    result = result + B + " " + C + " " + D + " " + E + " " + F + "\n";

                }
            }
            System.out.println(result);

        }
    }

}