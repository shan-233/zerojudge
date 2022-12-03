import java.util.Scanner;

/**
 * 只要宣告一個Scanner就好，其他就可以共同使用
 * while迴圈判斷，如果行數等於0時就結束
 */
public class D069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num-- != 0) {
            int year = scanner.nextInt();
            System.out.println(year % 400 == 0 || year % 100 != 0 && year % 4 == 0 ? "a leap year" : "a normal year");
        }
    }
}