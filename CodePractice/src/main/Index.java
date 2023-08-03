package main;
import java.util.List;

import dataTypes.*;

public class Index {
	public static void main(String[] args) {
		CharStack temp = new CharStack();
		System.out.println(temp.test("()()"));
		System.out.println(temp.test("()()("));
	}
}
