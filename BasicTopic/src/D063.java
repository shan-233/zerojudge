import java.util.Scanner;

/**
 * 正常應該是用if...else或是三元運算子
 * 但我用絕對值 Math.abs()
 * 1 - 0 and 0 - 1
 */
public class D063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringNum = scanner.nextLine();
        int intNum = Integer.parseInt(stringNum);
        System.out.println(Math.abs(intNum - 1));
    }
}
