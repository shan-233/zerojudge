import java.util.Scanner;

/**
 * 宣告Scanner抓使用者輸入的值
 * 宣告intNum轉換成int格式
 * 算出共有幾打 x 50
 * 算出餘數 x 5
 */
public class D827 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringNum = scanner.nextLine();
        int intNum = Integer.parseInt(stringNum);
        System.out.println((intNum / 12) * 50 + (intNum % 12) * 5);
    }
}