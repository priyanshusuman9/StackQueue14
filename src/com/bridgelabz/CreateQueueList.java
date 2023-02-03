package com.bridgelabz;

public class CreateQueueList{
    private Node front, rear;
    private int currentSize; // number of items

    //class to define linked node
    private class Node {
        int data;
        Node next;
    }

    // create constructor name as QueueUsingLinkedListMain.
    public CreateQueueList() {
        front = null;
        rear = null;
        currentSize = 0;
    }
    /* create a method isEmpty
     * they are boolean type that means Returns true if the queue is empty, else false.
     */
    public boolean isEmpty() {
        return (currentSize == 0);
    }

    /*
     * create enqueue method and pass the parameter
     * Add data to the end of the list.
     */
    public void enqueue(int data) {
        Node oldRear = rear;
        rear = new Node();
        rear.data = data;
        rear.next = null;

        if (isEmpty()) {
            front = rear;
        } else {
            oldRear.next = rear;
        }
        currentSize++;
        System.out.println(data + " added to the queue");
    }
    public static void main(String[] args) {
        CreateStackList queue = new CreateStackList();
       // CreateQueueList.enqueue(56);
        //CreateQueueList.enqueue(30);
        //CreateQueueList.enqueue(70);
    }

}