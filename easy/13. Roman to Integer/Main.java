import java.util.*;

public class Main {
    public static void main (String args[]) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        String str = "IVXLCDM";
        int Ans = 0;
        for (int i=s.length()-1 ; i>=0 ; i--) {
            if (s.charAt(i) == 'I') {
                Ans += 1;
            } else if (s.charAt(i) == 'V'){
                Ans += 5;
            } else if (s.charAt(i) == 'X'){
                Ans += 10;
            } else if (s.charAt(i) == 'L'){
                Ans += 50;
            } else if (s.charAt(i) == 'C'){
                Ans += 100;
            } else if (s.charAt(i) == 'D'){
                Ans += 500;
            } else if (s.charAt(i) == 'M'){
                Ans += 1000;
            }

            if (i != 0) {
                String t1 = "" + s.charAt(i);
                String t2 = "" + s.charAt(i - 1);
                if (str.indexOf(t1) > str.indexOf(t2)) {
                    if (s.charAt(i - 1) == 'I') {
                        Ans -= 1;
                    } else if (s.charAt(i - 1) == 'V'){
                        Ans -= 5;
                    } else if (s.charAt(i - 1) == 'X'){
                        Ans -= 10;
                    } else if (s.charAt(i - 1) == 'L'){
                        Ans -= 50;
                    } else if (s.charAt(i - 1) == 'C'){
                        Ans -= 100;
                    } else if (s.charAt(i - 1) == 'D'){
                        Ans -= 500;
                    } else if (s.charAt(i - 1) == 'M'){
                        Ans -= 1000;
                    }
                    i--;
                }
            }
        }
        return Ans;
    }
    
}