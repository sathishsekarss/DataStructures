import java.util.*;
public class DoublyLinkedList {

    static class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }

    static Node head,tail=null;

    public static void addNode(int data){
        //create a new Node
        Node newNode=new Node(data);
        if(head==null){
            //both head and tail will point to new node
            head=tail=newNode;
            //head's previous will point to null
            head.prev=null;
            //tail's next will point to null, as it is the last node of the list
            tail.next=null;
        }
        else{
            //new node will be added after tail such that tail's next will point to new Node
            tail.next=newNode;
            //newNode's previous will point to tail
            newNode.prev=tail;
            //newNode will become new tail
            tail=newNode;
            //As it is last node, tail's next will point to null
            tail.next=null;
        }
    }

    public static void display(){
        //Node current will point to head
        Node currentNode=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list");
        while(currentNode!=null){
            System.out.println(currentNode.data);
            currentNode=currentNode.next;
        }
    }

    public static void main(String[] args){
        //Add node one by one to node list
        addNode(1);
        addNode(2);
        addNode(3);
        addNode(4);
        addNode(5);
        addNode(6);

        display();
    }
    
}
