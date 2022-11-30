import java.util.Scanner;

/**
 * 除了不是400的倍數的100的倍數以外，四的倍數的年份均為閏年。
 *
 * Scanner快速寫法(?
 * 用三元運算子套公式進去，輸出結果
 */
public class D067 {
    public static void main(String[] args) {
        int year = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println(year % 400 == 0 || year % 100 != 0 && year % 4 == 0 ? "a leap year" : "a normal year");
    }
}