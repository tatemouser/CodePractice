package main;
import java.util.List;

import dataTypes.*;

public class Index {
	public static void main(String[] args) {
		// Simulates key pad on phone with buttons. Returns all possible combinations of letter combinations digits inputed as a String.
		HashMapWithCharArray temp = new HashMapWithCharArray();
		List<String> solutions = temp.letterCombinations("234");
		for(String vals: solutions) {
			System.out.println(vals);
		}
	}
}
