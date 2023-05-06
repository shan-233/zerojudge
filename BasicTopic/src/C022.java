import java.util.Scanner;

public class C022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num; i++) {
            int oneNum = Integer.parseInt(scanner.nextLine());
            int twoNum = Integer.parseInt(scanner.nextLine());
            int result = oneNum;
            while (oneNum != twoNum) {
                result += oneNum + 2;
                oneNum += 2;
            }
            System.out.println("Case " + i + ": " + result);
        }
    }
}