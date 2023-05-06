import java.util.Scanner;

public class D068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int kg = Integer.parseInt(input);
        int i = 0;
        if (kg > 50) {
            i = kg - 1;
            System.out.println(i);
        } else {
            System.out.println(kg);
        }
    }
}