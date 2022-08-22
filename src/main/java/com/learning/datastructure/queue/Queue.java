package com.learning.datastructure.queue;

// FIFO - First In - First Out
public class Queue {

    static final int MAX = 100;

    int front, rear, size;
    int capacity;
    int[] array;

    public Queue(int capacity) {
        this.capacity = capacity;
        front = rear = this.size = -1;
        array = new int[this.capacity];
    }

    public boolean isEmpty(Queue queue) {
        return (queue.size < 0);
    }

    public boolean isFull(Queue queue) {
        return (queue.size == capacity);
    }

    public int size() {
        int tmpSize = this.size + 1;
        return tmpSize;
    }

    public void enqueue(int item) {
        if (isFull(this)) {
            return;
        }
        if (this.front == -1) {
            this.front = 0;
        }
        this.rear = this.rear + 1;
        this.array[this.rear] = item;
        this.size++;
        System.out.println(item + " enqueued to queue");
    }

    public int dequeue() {
        int item;
        if (isEmpty(this)) {
            return -1;
        }
        item = this.array[this.front];
        this.front = this.front + 1;
        this.size = this.size - 1;
        return item;
    }

    // Method to get front of queue
    int front() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.array[this.front];
    }

    // Method to get rear of queue
    int rear() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.array[this.rear];
    }

}

// Driver class
class Test {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        System.out.println("Size of the queue before adding elements " + queue.size());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println("Size of the queue " + queue.size());

        System.out.println(queue.dequeue() + " dequeued from queue\n");
        System.out.println("Size of the queue after enqueue " + queue.size());

        System.out.println(queue.dequeue() + " dequeued from queue\n");
        System.out.println("Size of the queue after enqueue " + queue.size());

        System.out.println("Front item is " + queue.front());
        System.out.println("Rear item is " + queue.rear());
    }
}

