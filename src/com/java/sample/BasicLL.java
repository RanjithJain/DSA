package com.java.sample;

public class BasicLL {
    // Linked list implementation in Java


        // Creating a node
        Node22 head;

        public static void main(String[] args) {
            BasicLL linkedList = new BasicLL();

            // Assign value values
            linkedList.head = new Node22(1);
            Node22 second = new Node22(2);
            Node22 third = new Node22(3);

            // Connect nodess
            linkedList.head.next = second;
            second.next = third;

            // printing node-value
            while (linkedList.head != null) {
                System.out.print(linkedList.head.value + " ");
                linkedList.head = linkedList.head.next;
            }
        }

}

 class Node22 {
    int value;
    Node22 next;

    Node22(int d) {
        value = d;
        next = null;
    }
}
