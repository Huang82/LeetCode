import java.util.*;

public class Main {
    public static void main(String args[]) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        if ((x < 0) || (x !=0 && x%10 == 0)) {
            return false;
        }
        int temp = 0;
        while (x > temp) {
            temp = temp * 10 + x % 10;
            x /= 10;
        }
        return (x==temp || x == temp/10);
    }
}
/* 
    解題方向:
        先判斷x是否為負數或是x不為0也x除10的餘數等於0都不是迴文
        然後再用迴圈，
*/