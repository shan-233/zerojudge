import java.util.Scanner;

public class A009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            char[] A = input.toCharArray();// toCharArray 這個字串轉換到一個新的字串，input丟到A
            for (int i = 0; i < A.length; i++) { // length：一次取得字串長度
                int j = (int) A[i];// 可一次讀取一個字元
                j = j - 7;// ACSII碼共128個，1Byt=8bit，不能超過8bit，所以-7
                char k = (char) j;// 可一次讀取一個字元
                System.out.print(k);
            }
        }
    }
}