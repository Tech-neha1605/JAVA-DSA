package com.tka;

public class StackArrayImplementation {
	
	private int MaxSize; //maximum size of the stack
	private int top; //index of the top element 
	
	private int[] StackArray; //store the element of the stack 
	
	//constructor to initialize the stack 
	public StackArrayImplementation(int size) {
		MaxSize = size;
		StackArray = new int[MaxSize]; //top -1 indicate that stack is empty 
	}
	//check if stack is empty 
	public boolean isEmpty() {
		return(top==-1);
	}
	
	//check if stack is full 
	public boolean isFull() {
		return(top==MaxSize - 1);
	}
	
	//push element into the stack
	public void push(int element) {
		if(isFull()) {
			System.out.println("Stack is full  , can not insert more element ");
		}else {
			top++;
			StackArray[top]=element;
			System.out.println("Pushed element is "+" " + element + "onto the stack");
		}
	}
	
	
	//pop the element 
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty , cannot remove more element ");
			return -1;
		}else {
			int poppedElement=StackArray[top];
			top--;
			
			System.out.println("Popped element is " + poppedElement +" "+ "From the stack ");
			return poppedElement ;
		}
	}
	
	//get the top element from the stack 
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty , so no top element in the stack");
			return -1;
		}else {
			return StackArray[top];
		}
	}
	
	//get the size of the stack
	public int size() {
		return top+1;
	}
	
	public static void main(String[] args) {
		StackArrayImplementation stack = new StackArrayImplementation((5));
		stack.push(10);
		stack.push(50);
		stack.push(90);
		
		System.out.println("Top element : " + stack.peek());
		System.out.println("Size of the Stack is : " + stack.size());
		stack.pop();
		stack.pop();
		System.out.println("Top element : " + stack.peek());
		System.out.println("Size of the Stack is : " + stack.size());
	}

}
