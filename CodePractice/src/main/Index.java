package main;

import dataTypes.*;

public class Index {
    public static void main(String[] args) {
    	String[] temp = {"helloworld", "hello", "hellosaf", "hellobad"};
    	FindCommonPrefix solution = new FindCommonPrefix();
    	System.out.println(solution.longestCommonPrefix(temp));
    }
}
