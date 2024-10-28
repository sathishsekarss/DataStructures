import java.util.*;

/**
 * Step 1:  Create a node of class
 * Step 2:  Create object for the node class
 * Step 3:  Link the created objects with each other
 * Step 4:  Print the linked list
 */

public class LinkedList{
    // Class Node that contains data and reference to next node
    static class Node{
        public Node(int data){
            this.data=data;
        }
        int data;
        Node next;
    }
    public static void main(String[] args){
        Node firstNode=new Node(1);
        Node secondNode=new Node(2);
        Node thirdNode=new Node(3);

        firstNode.next=secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=null;

        // Printing the linked list
        // Store the node in a temp variable
        // When the temp variable is null that mean's we reached the end of linked list
        Node temp=firstNode;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}