import java.util.Scanner;

/**
 * 宣告Scanner
 * 把從Scanner抓來的值轉為Double
 * 宣告ans裝除3的值（題目說3人一組）
 * 宣告result來以「.」切割（因為是Double）
 * 判斷如果小數點後是0，就直接輸出，否則就 + 1
 */
public class D073 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringNum = scanner.nextLine();
        double intNum = Double.parseDouble(stringNum);
        String ans = String.valueOf(intNum / 3);
        String[] result = ans.split("\\.");
        System.out.println(result[1].equals("0") ? Integer.parseInt(result[0]) : Integer.parseInt(result[0]) + 1);
    }
}