import java.util.Scanner;

/**
 * 如果小於25，就直接用25去減
 * 如果超過25，就用60去減 + 25
 * 都不是的話輸出0（可能剛好25分）
 */

public class D060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringClock = scanner.nextLine();
        int intClock = Integer.parseInt(stringClock);
        int result = intClock < 25 ? 25 - intClock : intClock < 60 && intClock > 25 ? 60 - intClock + 25 : 0;
        System.out.println(result);
    }
}