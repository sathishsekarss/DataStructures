import java.util.*;

/**
 * Step 1:  Create a node of class
 * Step 2:  Create object for the node class
 * Step 3:  Link the created objects with each other and finally linked the last node with the first node
 * Step 4:  Print the linked list
 */
public class CircularLinkedList {
    // Class Node that contains data and reference to next node
    static class Node{
        public Node(int data){
            this.data=data;
        }
        int data;
        Node next;
    }

    public static void main(String[] args){
        Node first=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);

        first.next=second;
        second.next=third;
        third.next=first;

        //Print the linked list
        //print the first Node's data
        System.out.println(first.data);
        Node temp=first.next;
        while(temp!=first){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
