import java.util.Scanner;

public class C186 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] str = input.split(" ");

        for (int i = 0; i < str.length; i++) {

            String ans = Long.toString(i);

            System.out.println(str[i]);
        }

    }

}