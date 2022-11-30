import java.util.Scanner;

/**
 * 題目說明
 * 100排    100排    100排
 * 2500席    5000席    2500席
 * 每排各25人  每排各50人  每排各25人
 *
 * 先從第一區由左至右、由前至後，再接著第二、三區
 *
 * 第一、三區域是25倍數；第二區是50倍數
 *
 * 對於每筆測資輸出三個正整數，分別代表編號隸屬座位區、排數、每排位數。彼此間以 空白間隔。
 *
 * 解題說明
 * 判斷輸入的值是落在哪一區
 *
 * 若是第1區(25的倍數)，就直接除25，阿若不是就除完25+1(ex:26/25=1，所以要再+1表示是第二排)
 *
 * 若是第2區(50的倍數)，先減掉2500，再直接除50，阿若不是除完要再+1
 *
 * 若是第3區(25的倍數)，先減掉7500，再直接除25，阿若不是就除完要再+1
 *
 * 第三個答案統一先對輸入的值-1(這樣取餘數比較好算)，取完餘數再+1
 */
public class E835 {
    public static void main(String[] args) {
        int input = new Scanner(System.in).nextInt();
        if (input <= 2500) {
            int resultTwo = input % 25 == 0 ? (input / 25) : (input / 25) + 1;
            int resultThree = ((input - 1) % 25) + 1;
            System.out.println("1" + " " + resultTwo + " " + resultThree);
        } else if (input - 2500 <= 5000) {
            int resultTwo = input % 50 == 0 ? (input - 2500) / 50 : ((input - 2500) / 50) + 1;
            int resultThree = ((input - 1) % 50) + 1;
            System.out.println("2" + " " + resultTwo + " " + resultThree);
        } else {
            int resultTwo = input % 25 == 0 ? (input - 7500) / 25 : ((input - 7500) / 25) + 1;
            int resultThree = ((input - 1) % 25) + 1;
            System.out.println("3" + " " + resultTwo + " " + resultThree);
        }
    }
}