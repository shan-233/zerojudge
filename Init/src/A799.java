import java.util.Scanner;

public class A799 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int A = Integer.parseInt(num);

        //將輸入的數字乘上-1
        int i = -1;
        int j = 0;
        j = A * i;
        System.out.print(j);

    }

}