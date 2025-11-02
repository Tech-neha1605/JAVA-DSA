package com.tka;


//queue implementation using inbuilt function

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
	
	public static void main(String[] args) {
		
		//create a queue using linked list implementation
		Queue<String> queue = new LinkedList<>();
		
		//add elements to the queue 
		queue.offer("Apple");
		queue.offer("Orange");
		queue.offer("Banana");
		queue.offer("Pinneapple");
		
		
		//print the queue
		System.out.println("Queue : " + queue);
		
	    //get the element at the front of the queuewithout removing it 
		String front = queue.peek();
		System.out.println("Front elment of the queue is : " + front);
		
		//remove the element at the front of the queue
		String removedElement = queue.poll();
		System.out.println("Remove element is : " + removedElement);
		
		//print the updated queue 
		System.out.println("Updated queue is : " + queue);
		
		//check if the queue is emty or not 
		boolean isEmpty = queue.isEmpty();
		System.out.println("Is the queue Empty ??" + isEmpty);
		
		//check the size of the queue 
		int size = queue.size();
		System.out.println("Size of the Queue : " + size);
		
		
		
		
	}

}
