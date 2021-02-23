
import java.util.*;

public class Main {
    public static void main (String args[]) {
        int sum = -1234564;
        
        System.out.println(reverse(sum));
    }

    public static int reverse(int x) {
        int ans = 0; 
        while (x != 0) {
            int t = x % 10;
            int a = ans * 10 + t;
            if ((a - t)/10 != ans){
                return 0;
            }
            ans = a;
            x /= 10;
        }
        return ans;
    }
}   
/* 
    解題方向：
        這題要考慮到溢位，
        檢查溢位可以用當迴圈加完之後來檢查，加完後如果扣回去再除與10一定會等於原本的數字，
        但如果數字溢位了，儲存的數字就會改變，就代表此組數字是為溢位
*/