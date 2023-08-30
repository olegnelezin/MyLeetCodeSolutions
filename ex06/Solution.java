public class Solution {
    public static boolean isStrictlyPalindromic(int n) {
        boolean isPol = true;
        for (int i = 2; i < n - 1; i++) {
            int x = n;
            StringBuilder strictNum = new StringBuilder();
            while (x > 0) {
                int j =  x - (x / i) * i;
                x /= i;
                strictNum.append(j);
            }
            char[] chars = strictNum.toString().toCharArray();
            int l = chars.length;
            for (int j = 0; j < l/2; j++) {
                if (chars[j] != chars[l - 1 - j]) {
                    isPol = false;
                    break;
                }
            }
            if (!isPol) {
                break;
            }
        }
        return isPol;
    }
}