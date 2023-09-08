

public class Main {
    public int[] countBits(int n) {
        int[] a = new int[n+1];
        for (int i = 0; i <=n; i++) {
            StringBuilder strictNum = new StringBuilder();
            int x = i;
            while (x > 0) {
                int j =  x - (x / 2) * 2;
                x /= 2;
                strictNum.append(j);
            }
            int c = 0;
            for (int k = 0; k < strictNum.length(); k++) {
                if (strictNum.charAt(k) == '1') {
                    c++;
                }
            }
            a[i] = c;
        }
        return a;
    }
}