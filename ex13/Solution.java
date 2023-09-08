
public class Solution {

    public String interpret(String command) {
        String cmd = "";
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                cmd += "G";
            } else if (command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                cmd += "o";
                i++;
            } else if (command.charAt(i) == '(' && command.charAt(i+1) == 'a') {
                cmd += "al";
                i+=2;
            }
        }
        return cmd;
    }
}