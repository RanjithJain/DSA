package com.java.sample;

import java.util.ArrayList;

public class GenericsStack<E> {

    int top;
    ArrayList<E> stackList;

    public GenericsStack() {
        top = 0;
        stackList = new ArrayList<E>();
    }

    private void push(E e) {
        stackList.add(top, e);
        top++;
    }

    private E pop() {
        if (top != 0) {
            top--;
            E e = stackList.get(top);
            return e;
        }
        return null;
    }

    public static void main(String[] args) {

        GenericsStack<Integer> genericsStack = new GenericsStack<Integer>();
        System.out.println("Popped out " + genericsStack.pop());
        genericsStack.push(10);
        genericsStack.push(20);
        genericsStack.push(50);
        genericsStack.push(60);
        genericsStack.push(70);
        genericsStack.push(80);
        genericsStack.push(90);
        genericsStack.push(100);
        System.out.println("Popped out " + genericsStack.pop());
        genericsStack.push(40);
        System.out.println("Popped out " + genericsStack.pop());
        genericsStack.push(110);
        System.out.println("Popped out " + genericsStack.pop());
        System.out.println(genericsStack.top);

        GenericsStack<String> genericsStackString = new GenericsStack<String>();
        genericsStackString.push("ranjith");
        genericsStackString.push("Khushbu");
        genericsStackString.push("Nishtha");
        System.out.println("Popped out " + genericsStackString.pop());
        System.out.println("Popped out " + genericsStackString.pop());
        genericsStackString.push("Rishvi");

    }
}
