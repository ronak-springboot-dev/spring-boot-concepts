package com.example.dsanew.ll;

public class CustomLL {

    /**
     * Linked list contains mainly
     * <p>
     * 1. head  which is node basically
     * 2. tail  which is node basically
     * 3 size
     */
    private Node head;
    private Node tail;
    private int size;


    //add value at beginning of the linkedList

    public void addValueAtBeginning(int value) {


        Node node = new Node(value);

        //assign existing head to the next node because every value will be stored in head first
        node.next = head;


        //now store latest incoming node into head

        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;

    }


    public void printLinkedList() {

        Node existingNode = head;
        while (existingNode != null) {
            System.out.print(existingNode.value);

            existingNode = existingNode.next;
            if (existingNode != null) {
                System.out.print("--> ");
            }
        }

    }

    /**
     * Node contains only 2 values
     * <p>
     * 1. is current value
     * 2. reference of next node
     */
    static class Node {
        private int value;
        private Node next;


        public Node(int value, Node next) {
            this.next = next;
            this.value = value;
        }

        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }
    }


    public static void main(String[] args) {

        CustomLL customLL = new CustomLL();
        customLL.addValueAtBeginning(1);
        customLL.addValueAtBeginning(2);
        customLL.addValueAtBeginning(3);
        customLL.addValueAtBeginning(4);

        customLL.printLinkedList();
    }

}
