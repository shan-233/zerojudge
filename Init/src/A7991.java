import java.util.Scanner;

public class A7991 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();// 輸入數字
            System.out.println(Math.abs(n));// Math.abs=負數轉正數
        }

    }

}