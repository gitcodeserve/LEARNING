package com.learning.datastructure.stack;

/* Java program to implement basic stack operations */
// LIFO - Last In First Out
class Stack {
    static final int MAX = 1000;
    int top;
    int[] a = new int[MAX]; // Maximum size of Stack

    Stack() {
        top = -1;
    }

    boolean isEmpty() {
        return (top < 0);
    }

    int size() {
        int size = top;
        return ++size;
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }
}

// Driver code
class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Size of stack " + s.size());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Size of stack " + s.size());
        System.out.println("Empty ? " + s.isEmpty());
        System.out.println(s.pop() + " Popped from stack");
    }
}
