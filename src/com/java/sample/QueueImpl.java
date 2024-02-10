package com.java.sample;

import java.util.HashMap;

public class QueueImpl {

    int front;
    int rear;
    int[] queueArray = new int[10];

    QueueImpl() {
        front = -1;
        rear = -1;
    }

    private void enQueue(int item) {
        if (rear < 10) {
            if (front == -1)
                front = 0;
            rear++;
            queueArray[rear] = item;
        }
    }

    private int deQueue() {
        int item = 0;
        if (front >= 0) {
            item = queueArray[front];
            front++;
        }
        return item;
    }

    public static void main(String[] args) {
        QueueImpl qu = new QueueImpl();
        qu.enQueue(10);
        qu.enQueue(20);
        qu.enQueue(30);
        qu.enQueue(40);
        System.out.println(" removed from que" + qu.deQueue());
        qu.enQueue(50);
        System.out.println(" removed from que" + qu.deQueue());
        qu.enQueue(60);
        System.out.println(" removed from que" + qu.deQueue());
        HashMap<String, String> hashMap=new HashMap<>();


    }
}
