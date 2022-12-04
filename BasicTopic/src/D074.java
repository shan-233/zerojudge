import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class D074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 宣告一個Scanner
        int num = Integer.parseInt(scanner.nextLine()); // 宣告num變數來紀錄共有幾班
        int[] inputNum = new int[num]; // 宣告一個inputNum陣列，num紀錄的值代表這陣列大小是多少
        String input = scanner.nextLine(); // 紀錄有幾個班(以空白間隔)
        if (num == 1) { // 如果班級只有１
            System.out.println(input); // 不用分割也不用比較直接輸出
        } else {
            for (int i = 0; i < num; i++) {
                inputNum[i] = Integer.parseInt(input.split(" ")[i]); // 跑for迴圈以空白切割裝進去陣列裡面
            }
            IntStream intStream = Arrays.stream(inputNum); // 因為是int陣列，所以宣告一個IntStream，透過Arrays.stream來轉換inputNum陣列
            OptionalInt optionalInt = intStream.max(); // 利用intStream.max找出最大值後，裝進OptionalInt(只會有一個Int值)
            int maxAsInt = optionalInt.getAsInt(); // 因為希望最後返回的型態是int，所以用getAsInt()來轉換
            System.out.println(maxAsInt); // 最後輸出結果
        }
    }
}