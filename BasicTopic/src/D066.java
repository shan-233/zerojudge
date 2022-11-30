import java.util.Scanner;

/**
 * 用空格分割都轉成分鐘比較好判斷
 * 07：30 → 07 * 60 + 30 = 450
 * 17：00 → 17 * 60 = 1020
 */
public class D066 {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        int clock = (Integer.parseInt(input.split(" ")[0]) * 60) + Integer.parseInt(input.split(" ")[1]);
        System.out.println(clock >= 450 && clock < 1020 ? "At School" : "Off School");
    }
}