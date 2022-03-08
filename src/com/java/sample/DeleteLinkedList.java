package com.java.sample;

public class DeleteLinkedList {

    static Node head;

    public static void main(String[] args) {

        DeleteLinkedList deleteLinkedList=new DeleteLinkedList();
        deleteLinkedList.head =new Node(10);
        deleteLinkedList.head.next=new Node(5);
        deleteLinkedList.head.next.next=new Node(20);
        deleteLinkedList.head.next.next.next=new Node(8);

        printlist(head);
        head=deleteLinkedList.delete(8);
        System.out.println("List after removing ");

        printlist(head);

    }

    public static Node delete(  int item){
        Node prev=null;
        Node current=head;

        while(current!=null){
            if(head.value==item){
                head=head.next;
                return head;
            }
            if(current.value==item){
                prev.next=current.next;
                current=current.next;

            }else{
                prev=current;
                current=current.next;
            }

        }
        return head;
    }

    public static void printlist(Node node){
        while(node!=null){
            System.out.println(" "+ node.value);
            node=node.next;
        }
    }
}
