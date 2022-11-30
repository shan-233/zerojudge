import java.util.Scanner;

/**
 * Math.max() → 比較最大值(不能用String型態)
 *
 * 先split空格
 * 宣告int、two、three這三個Int變數，轉換stringArray0、1、2型態
 * 先Math.max1跟2，再把這個結果跟3比較
 */
public class D065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] stringArray = input.split(" ");
        int one = Integer.parseInt(stringArray[0]);
        int two = Integer.parseInt(stringArray[1]);
        int three = Integer.parseInt(stringArray[2]);
        System.out.println(Math.max(Math.max(one, two), three));
    }
}