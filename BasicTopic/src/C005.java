import java.util.Scanner;

public class C005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 宣告一個Scanner
        int oneNum = Integer.parseInt(scanner.nextLine()); // 紀錄總共有幾組
        while (oneNum-- != 0) { // 進入迴圈
            int twoNum = Integer.parseInt(scanner.nextLine()); // 紀錄每一組共有幾筆資料
            long result = 0; // 宣告一個result來累加結果(要在這層迴圈裡宣告是因為每重新一組就歸0重算)
            while (twoNum-- != 0) {
                String input = scanner.nextLine(); // 紀錄每一行輸入的資料
                result += Long.parseLong(input.split(" ")[0]) * Long.parseLong(input.split(" ")[2]);
                // result = result + 第一組數字 * 第三組數字
            }
            System.out.println(result); // 計算好一組就輸出答案
        }
    }
}