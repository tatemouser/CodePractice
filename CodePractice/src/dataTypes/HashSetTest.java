package dataTypes;
import java.util.HashSet;

public class HashSetTest {
	// .call("abbsk") for 3
	
	public int call(String s) {
        HashSet<Character> charSet = new HashSet<>();
		
        int left = 0;
        int right = 0;
        int max = 0;
        
        while(right < s.length()) {
        	char c = s.charAt(right);
        	if(!charSet.contains(c)) {
        		charSet.add(c);
        		max = Math.max(max, charSet.size());
        		right++;
        	} else {
        		charSet.remove(s.charAt(left));
        		left++;
        	}
        }
        
		return max;
	}
}
