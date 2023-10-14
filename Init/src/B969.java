import java.util.Scanner;

public class B969 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num0 = sc.nextLine();
        String[] All = num0.split(" ");

        String num1 = sc.nextLine();

        for (int i = 0; i < All.length; i++) {

            System.out.println(num1 + ", " + All[i]);

        }

    }

}