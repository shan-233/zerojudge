import java.util.Scanner;

public class D073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int num = Integer.parseInt(input);
        System.out.println((num - 1) / 3 + 1);
    }
}