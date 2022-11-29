import java.util.Scanner;

/**
 * 對輸入的數字除2取餘數
 * 餘數 = 0 → Even
 * 餘數 != 0 → Odd
 */
public class D064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int intInput = Integer.parseInt(input);
        int result = intInput % 2;
        System.out.println(result == 0 ? "Even" : "Odd");
    }
}