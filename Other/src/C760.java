import java.util.Scanner;

public class C760 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] All = input.split(" ");
        for (int i = 0; i < All.length; i++) {
            String ans = All[i];
            ans = ans.toUpperCase().charAt(0) + ans.substring(1); // 字首轉大寫
            System.out.println(ans);
        }
    }
}