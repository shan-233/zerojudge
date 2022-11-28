import java.util.Scanner;

/**
 * 宣告一個Scanner
 * 宣告stringClock來抓使用者輸入的年份
 * 透過Intrger.parseInt來轉換型態
 * 最後判斷intClock是否小於15
 * 是 → intClock+24再減掉時差15；否 → 直接減掉15
 */
public class D050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringClock = scanner.nextLine();
        int intClock = Integer.parseInt(stringClock);
        System.out.println(intClock < 15 ? (intClock + 24) - 15 : intClock - 15);
    }
}