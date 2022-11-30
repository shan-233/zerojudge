import java.util.Scanner;

/**
 * 取得輸入的體重
 * 判斷如果大於50，就 -1，否則就保持原體重
 */
public class D068 {
    public static void main(String[] args) {
        int weight = new Scanner(System.in).nextInt();
        System.out.println(weight > 50 ? weight - 1 : weight);
    }
}