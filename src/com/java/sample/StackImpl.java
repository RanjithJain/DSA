package com.java.sample;

import java.util.Arrays;

public class StackImpl {

    static int top = 0;
    static int[] stackArray = new int[10];

    public static void main(String[] args) {

        push(10);
        push(20);
        System.out.println(pop());
        printStack();
    }

    public static void push(int data) {
        if (top < stackArray.length) {
            stackArray[top] = data;
            top++;
        }

    }

    public static int pop() {
        int data = -1;
        if (top > 0) {
            data = stackArray[top - 1];
            top--;
        }
        return data;
    }

    public static void printStack() {
        System.out.println("Stack" + Arrays.toString(stackArray));
    }
}
