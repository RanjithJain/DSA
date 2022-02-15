package com.java.sample;

public class GroupReverseLinkedList {

    Node head;

    public static void main(String[] args) {

        GroupReverseLinkedList linkedList = new GroupReverseLinkedList();
        linkedList.head = new Node(1);
        linkedList.head.next = new Node(3);
        linkedList.head.next.next = new Node(5);
        linkedList.head.next.next.next = new Node(10);
        linkedList.head.next.next.next.next = new Node(20);
        linkedList.head.next.next.next.next.next = new Node(30);
        int element = 3;
        Node reverseNode = reverse(linkedList.head, element);
        printList(reverseNode);
    }

    public static Node reverse(Node node, int count) {

        Node current, next = null, prev = null;
        current = node;
        int elements = 0;
        while (current != null && elements < count) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            elements++;
        }
        if (next != null) {
            node.next = reverse(next, count);
        }
        return prev;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.println("List  = " + head.value);
            head = head.next;
        }
    }
}
