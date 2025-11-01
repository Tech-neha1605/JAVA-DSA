package com.tka;
import java.util.Stack;
public class StackUsingLibrary {
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		//push element to the stack or to add element 
		
		stack.push("Apple");
		stack.push("Orange");
		stack.push("Banana");
		stack.push("Pinnaple");
		
		System.out.println("Stack : " + stack);
		
		//popping element from the stack or delete the element 
		
		String poppedElement =stack.pop();
		System.out.println("Popped Element : " + poppedElement);
		
		System.out.println("Stack After Popping :" + stack);
		
		//peek function is to find the top element of the stack
		String TopElement=stack.peek();
		System.out.println("The top element of the Stack : " + TopElement);
		
		
		//stack is empty or not
		boolean isEmpty=stack.empty();
		System.out.println("Is Stack Empty :" + isEmpty);
		
		//get size of stack
		int size = stack.size();
		System.out.println("Size of the Stack : " + size);
		
	}

}
