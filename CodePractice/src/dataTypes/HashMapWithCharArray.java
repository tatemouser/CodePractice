package dataTypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class HashMapWithCharArray {

    public List<String> letterCombinations(String digits) {
        ArrayList<String> solution = new ArrayList<>();
        if (digits == null || digits.length() == 0) return solution;

        Map<Integer, char[]> vals = new HashMap<>();
        add(vals);

        letterCombinationsHelper(digits, 0, new StringBuilder(), vals, solution);

        return solution;
    }

    private void letterCombinationsHelper(String digits, int index, StringBuilder current, Map<Integer, char[]> vals, List<String> solution) {
        if (index == digits.length()) {
            solution.add(current.toString());
            return;
        }

        int num = digits.charAt(index) - '0';
        char[] charList = vals.get(num);

        for (char c : charList) {
            current.append(c);
            letterCombinationsHelper(digits, index + 1, current, vals, solution);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public void add(Map<Integer, char[]> temp) {
        char[] two = {'a', 'b', 'c'};
        temp.put(2, two);
        char[] three = {'d', 'e', 'f'};
        temp.put(3, three);
        char[] four = {'g', 'h', 'i'};
        temp.put(4, four);
        char[] five = {'j', 'k', 'l'};
        temp.put(5, five);
        char[] six = {'m', 'n', 'o'};
        temp.put(6, six);
        char[] seven = {'p', 'q', 'r', 's'};
        temp.put(7, seven);
        char[] eight = {'t', 'u', 'v'};
        temp.put(8, eight);
        char[] nine = {'w', 'x', 'y', 'z'};
        temp.put(9, nine);
    }
}


