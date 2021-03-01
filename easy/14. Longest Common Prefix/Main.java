
public class Main{
    public static void main (String args[]) {
        System.out.println(longestCommonPrefix(new String[]{"ab","a"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        String str = "";
        for(int j=0 ; j<strs[0].length() ; j++) {
            str += strs[0].charAt(j);
            for (int i=0 ; i<strs.length ; i++) {
                System.out.println(strs[0].indexOf(str) + "  " + strs[i].indexOf(str) + "  " + str.length());
                if (strs[0].indexOf(str) != strs[i].indexOf(str) && str.length() >= 1) {
                    String ans = "";
                    for (int k=0 ; k<str.length()-1 ; k++) {
                        ans += str.charAt(k);
                    }
                    return ans;
                } else if (j == strs[0].length()-1 && i == strs.length-1) {
                    return str;
                }
            }
        }
        return "";
    }
}