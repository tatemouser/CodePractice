package main;

import dataTypes.*;

public class Index {
    public static void main(String[] args) {
    	MergeArray temp = new MergeArray();
    	int[] one = {2,2,3,0,0,0};
    	int[] two = {1,5,6};
    	int[] solution = temp.merge(one, 3, two, 3);
    	
    	for(int sol: solution) {
    		System.out.println(sol);
    	}
    }
}
