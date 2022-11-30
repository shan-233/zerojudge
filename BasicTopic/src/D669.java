import java.util.Scanner;

/**
 * 一樣先都把時間轉為分鐘
 * 用while迴圈，如果是4個0就break
 * 如果鬧鐘時間 - 現在時間是負數，代表到了隔天，就要再加一天（12 * 60 = 1440）
 */
public class D669 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String inputClock = input.nextLine();
            if (inputClock.equals("0 0 0 0")) {
                break;
            }
            int nowClock = (Integer.parseInt(inputClock.split(" ")[0]) * 60) + Integer.parseInt(inputClock.split(" ")[1]);
            int afterClock = (Integer.parseInt(inputClock.split(" ")[2]) * 60) + Integer.parseInt(inputClock.split(" ")[3]);
            int result = afterClock - nowClock;
            System.out.println(result < 0 ? result + 1440 : result);
        }
    }
}