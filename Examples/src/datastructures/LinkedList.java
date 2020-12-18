package datastructures;

public class LinkedList {
    Node head;

    LinkedList(Node head) {
        this.head = head;
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        first.next = second;
        second.next = third;
        LinkedList linkedList = new LinkedList(first);
        linkedList.printList();

    }
}
