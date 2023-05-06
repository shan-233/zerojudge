import java.util.Scanner;

public class B970 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.nextLine();
        int ans = Integer.parseInt(A);
        for (int i = 1; i <= ans; i++) {
            System.out.println(i + ". I don't say swear words!");
        }
    }
}