
import java.util.*;

public class main {
    public static void main (String argsp[]) {
        int sum = -1234;
        
        System.out.println(reverse(sum));
    }

    public static int reverse(int x) {
        boolean s = false;
        String str = "";

        if (x < 0){
            x = Math.abs(x);
            s = true;
        }
        while (x != 0) {
            str += x % 10;
            x /= 10;
        }
        try {
            if (Integer.parseInt(str) > Integer.MAX_VALUE) {
                return 0;
            }
        } catch (Exception ex) {
            return 0;
        }

        if (s) {
            str = "-" + str;
        }

        return Integer.parseInt(str);
    }
}   