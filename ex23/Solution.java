public class Solution {

    public int mostWordsFound(String[] sentences) {
        int max = 0;
        int count;
        for (int i = 0; i < sentences.length; i++) {
            String l = sentences[i];
            count = 0;
            for (int j = 0; j < l.length(); j++) {
                char a = l.charAt(j);
                if (a == ' ') {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        return max + 1;
    }
}