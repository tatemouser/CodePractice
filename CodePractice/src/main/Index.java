package main;

import dataTypes.*;

public class Index {
    public static void main(String[] args) {
    	OverlappingGrids temp = new OverlappingGrids();
    	// first two numbers represent the bottom left coordinate and the last two represent the top right.
    	// If the boxes overlap then the program returns true.
    	int[] test1 = {0,0,2,2};
    	int[] test2 = {1,1,3,3};
    	System.out.println(temp.isRectangleOverlap(test1, test2));
    	
    }
}
