import java.util.Scanner;

/**
 * 華式轉攝氏公式：5/9 x (華氏溫度 - 32)
 * <p>
 * 宣告一個Scanner
 * 宣告stringClock來抓使用者輸入的年份
 * 透過Intrger.parseInt來轉換型態
 * 最後用String.format搭配"%.3f"來保留小數點第三位
 */
public class D051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringTemperature = scanner.nextLine();
        int intTemperature = Integer.parseInt(stringTemperature);
        System.out.println(String.format("%.3f", (intTemperature - 32) * 5.0 / 9));
    }
}
