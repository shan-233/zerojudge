import java.util.Scanner;

/**
 * 宣告一個num變數來裝總共有幾個數字
 * 宣告一個ans陣列，用for迴圈去跑，分別裝input % 3的值
 * 宣告one、two、three變數
 * 再宣告一個for迴圈搭配switch...case去判斷，如果答案是0，one++，以此類推
 */
public class A058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] ans = new int[num];
        int one = 0, two = 0, three = 0;
        for (int i = 0; i < num; i++) {
            int input = scanner.nextInt();
            ans[i] = input % 3;
        }
        for (int j = 0; j < num; j++) {
            switch (ans[j]) {
                case 0:
                    one++;
                    break;
                case 1:
                    two++;
                    break;
                case 2:
                    three++;
                    break;
                default:
                    return;
            }
        }
        System.out.println(one + " " + two + " " + three);
    }
}