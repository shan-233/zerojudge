import java.util.Scanner;

/**
 * 宣告一個Scanner
 * 宣告stringYear來抓使用者輸入的年份
 * 透過Intrger.parseInt來轉換型態
 * 最後輸出intYear - 1911
 */
public class D049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringYear = scanner.nextLine();
        int intYear = Integer.parseInt(stringYear);
        System.out.println(intYear - 1911);
    }
}
