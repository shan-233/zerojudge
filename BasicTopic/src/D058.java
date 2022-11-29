import java.util.Scanner;

/**
 * 給一個整數 n，若 n > 0 輸出 1，若 n = 0 輸出 0，若 n < 0 輸出 -1。
 * 用三元運算子來進行判斷
 */
public class D058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringNum = scanner.nextLine();
        int intNum = Integer.parseInt(stringNum);
        System.out.println(intNum > 0 ? "1" : intNum == 0 ? "0" : "-1");
    }
}
