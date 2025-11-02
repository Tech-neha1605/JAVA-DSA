package com.tka;

public class QueueExample2 {
    
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    
    public QueueExample2(int capacity) {
        this.capacity = capacity;
        queueArray = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
    
    public int size() {
        return size;
    }
    
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full, cannot enqueue " + element);
            return;
        }
        rear = (rear + 1) % capacity;
        queueArray[rear] = element;
        size++;
        System.out.println("Enqueued: " + element);
    }
    
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot dequeue");
            return -1;
        }
        int removedElement = queueArray[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Dequeued: " + removedElement);
        return removedElement;
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty, no peek element");
            return -1;
        }
        return queueArray[front];
    }
    
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        int count = 0;
        int index = front;
        while (count < size) {
            System.out.print(queueArray[index] + " ");
            index = (index + 1) % capacity;
            count++;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        QueueExample2 queue = new QueueExample2(5);
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        
        queue.display();
        
        queue.dequeue();
        queue.display();
        
        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue size: " + queue.size());
        
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        
        queue.display();
    }
}
