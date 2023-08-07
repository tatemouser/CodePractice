package main;

import dataTypes.*;

public class Index {
    public static void main(String[] args) {
    	gcdOfStrings temp = new gcdOfStrings();
    	System.out.println(temp.test("ABCABC", "ABC"));
    	System.out.println(temp.test("ABCABC", "AB"));
    }
}
