import java.util.Scanner;

/**
 * 先用空白切割
 * 然後分別套入公式 (M*2+D)%3
 * 最後用三元運算子判斷結果
 */
public class A003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringData = scanner.nextLine();
        String[] splitStringData = stringData.split(" ");
        int result = (Integer.parseInt(splitStringData[0]) * 2 + Integer.parseInt(splitStringData[1])) % 3;
        System.out.println(result == 0 ? "普通" : result == 1 ? "吉" : "大吉");
    }
}