import java.util.Scanner;

/**
 * 只要宣告一個Scanner就好，其他就可以共同使用
 * 用for迴圈
 */
public class D072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            int year = scanner.nextInt();
            String result = year % 400 == 0 || year % 100 != 0 && year % 4 == 0 ? "a leap year" : "a normal year";
            System.out.println("Case " + i + ": " + result);
        }
    }
}