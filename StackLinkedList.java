package com.tka;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top; // reference to the top of the stack

    // constructor to initialize an empty stack
    public Stack() {
        this.top = null;
    }

    // check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // push element onto the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top; // link new node to previous top
        top = newNode; // update top
    }

    // pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop element");
            return -1;
        }
        int poppedElement = top.data;
        top = top.next; // move top to the next node
        return poppedElement;
    }

    // return the top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot peek element");
            return -1;
        }
        return top.data;
    }

    // display the elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty, nothing to print");
            return;
        }
        Node current = top;
        System.out.println("Stack is: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class StackLinkedList {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        stack.display();

        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Peek element is: " + stack.peek());

        stack.display();
    }
}
