import java.util.Scanner;

public class D066 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String Time1 = sc.next();
            int h = Integer.parseInt(Time1);
            String Time2 = sc.next();
            int m = Integer.parseInt(Time2);
            if (8 <= h && h < 17) {
                System.out.println("At School");
            } else if (7 == h && m == 30) {
                System.out.println("At School");
            } else {
                System.out.println("Off School");
            }
        }
    }
}