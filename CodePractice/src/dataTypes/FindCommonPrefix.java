package dataTypes;

public class FindCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        String maxString = strs[0];
        for (String str : strs) {
            if (str.length() > maxString.length()) {
                maxString = str;
            }
        }
        
        String sol = "";
        for (int i = 0; i < maxString.length(); i++) {
            String sub = maxString.substring(0, i+1);
            boolean check = true;
            
            for (String s : strs) {
                if (!s.startsWith(sub)) {
                    check = false;
                    break;
                }
            }
            
            if (check) {
                sol = sub;
            } else {
                break;
            }
        }
        return sol;
    }
}
