package dataTypes;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Fibonacci fib = new Fibonacci();
		System.out.println("Rec results is ");
		fib.nonrecFib(5);
	}
}

class Fibonacci {

	class Record {
		int num; // 
		int indicator;
	}

	class StackNode {
		Record item;
		StackNode next;
	}

	class Stack
	{
		StackNode top;

		Stack()
		{
			top = null;
		}

		void push(Record item)
		{
			StackNode temp = top; // holds the values of the old top
			top = new StackNode();
			top.item = item;
   
			top.next = temp;
		}

		Record pop()
		{
			Record result = null;
			if(top != null)
			{
				result = top.item;
				top = top.next;
			}
			return result;
		}
		boolean isEmpty()
		{
			return (top == null);
		}

	}

	int nonrecFib(int num)
	{
	Record start = new Record();
	
	int results[] = new int[num+1]; 
	
	// two base cases
	results[0] = 0;
	results[1] = 1;
	
	// set the initial record
	start.num = num;
	start.indicator = 0;
	Stack recs = new Stack();
	recs.push(start);
	
	Record active;

	while(! recs.isEmpty())
	   {
	
	  active = recs.pop();
	
	  if(active.num <= 1)
	      {
	     active.indicator = 3; // the result is ready
	      }
	  else
	      { 
		  // not the base case
		  if(active.indicator == 2) {
	    	  // add two children
			  results[active.num] = results[active.num-1] + results[active.num-2];
			  active.indicator = 3;
	      } else {
	    	  // create two children
	    	  
	    	  // calc first child
	    	  active.indicator++;
	    	  Record c1 = new Record();
	    	  c1.indicator = 0;
	    	  c1.num = active.num-1;
	    	  
	    	  // calc second child
	    	  active.indicator++;
	    	  Record c2 = new Record();
	    	  c2.num = active.num-2;
	    	  c2.indicator = 0;
	    	  
	    	  // push element and children to stack
	    	  recs.push(active);
	    	  recs.push(c1);
	    	  recs.push(c2);
	      		}
	      	}
	      
	      if(active.indicator == 3) {
	    	  //print 
	          System.out.println("Fib(" + active.num + ") is: " + results[active.num]);
	      }
	   }
	return results[num];
	}
}
