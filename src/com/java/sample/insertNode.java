package com.java.sample;

import java.io.IOException;
import java.util.Scanner;

public class insertNode {

    public static Node insertNodeAtPosition(Node llist, int data, int position) {
        Node current = llist;
        int count = 1;
        while (current != null && count <= position) {
            if (count == position) {
                Node nextNode = current.next;
                current.next = new Node(data);
                current.next.next = nextNode;

            } else {
                current = current.next;
            }
            count++;
        }
        // 2 5 1 10
        return llist;
    }

    public static void main(String[] args) throws IOException {

        Node llist = new Node(2);
        llist.next = new Node(5);
        llist.next.next = new Node(10);

        int data = 1;
        int position = 1;
        insertNodeAtPosition(llist, data, position);
        while (llist != null) {
            System.out.println("After node = " + llist.value);
            llist = llist.next;
        }
    }
}

