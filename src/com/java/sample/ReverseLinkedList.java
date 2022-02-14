package com.java.sample;

public class ReverseLinkedList {

    static Node head;

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);

    }
    public static Node reverse(Node node){
        Node current=node;
        Node prev=null;
        Node next=null;

        while(current != null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        node=prev;
        return node;
    }
    public void printList(Node node){
        while(node!=null){
            System.out.println("node = " + node.value);
            node=node.next;
        }
    }

}


