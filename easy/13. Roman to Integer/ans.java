public class ans {
   public static void main (String args[]) {
        System.out.println(romanToInt("MCMXCIV"));
   } 

   public static int romanToInt(String s) {
        int ans = 0;
        if (s.indexOf("IV") != -1) ans -=2;
        if (s.indexOf("IX") != -1) ans -=2;
        if (s.indexOf("XL") != -1) ans -=20;
        if (s.indexOf("XC") != -1) ans -=20; 
        if (s.indexOf("CD") != -1) ans -=200;
        if (s.indexOf("CM") != -1) ans -=200;

        for (int i=s.length()-1 ; i>=0 ; i--) {
            if (s.charAt(i) == 'I') ans +=1;
            if (s.charAt(i) == 'V') ans +=5;
            if (s.charAt(i) == 'X') ans +=10;
            if (s.charAt(i) == 'L') ans +=50;
            if (s.charAt(i) == 'C') ans +=100;
            if (s.charAt(i) == 'D') ans +=500;
            if (s.charAt(i) == 'M') ans +=1000;
        }
        return ans;
   }
}
/*
    解題方向:
        先扣除4,9,40,90,400,900的羅馬數字*2 (ex. 500-400 = 100 * 2 = 200)
        然後再去加總所有遇到的羅馬數字
*/