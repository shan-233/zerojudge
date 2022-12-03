import java.util.Scanner;

public class A005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 只要宣告一個Scanner就好
        int num = Integer.parseInt(scanner.nextLine()); // 宣告num來看有幾行
        while (num-- != 0) { // while迴圈，如果等於0就停止
            String input = scanner.nextLine(); // 宣告input來記錄輸入的字串
            int three = Integer.parseInt(input.split(" ")[2]); // 用空格分割出第三個數字
            int four = Integer.parseInt(input.split(" ")[3]); // 用空格分割出第四個數字
            int endNum; // 宣告endNum來裝最後一個數字
            if (four % three != 0) { // 判斷，如果第四個數字除第三個數字餘數不等於0
                endNum = Integer.parseInt(input.split(" ")[3]) + (four - three); // 等差，endNum等於第四個數字 + 第4個數字 - 第3個數字
            } else {
                endNum = Integer.parseInt(input.split(" ")[3]) * (four / three); // 等比，endNum等於第四個數字 * 第4個數字 / 第3個數字
            }
            System.out.println(input + " " + endNum); // 輸出答案
        }
    }
}