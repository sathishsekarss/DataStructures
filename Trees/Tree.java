import java.util.*;

public class Tree{

    //inner class Node
    static class Node{
        Node leftNode;
        int data;
        Node rightNode;

        public Node(int data){
            this.data=data;
        }
    }

    public static void printTree(Node node){
        System.out.println(node.data);
        if(node.leftNode!=null){
            printTree(node.leftNode);
        }
        if(node.rightNode!=null){
            printTree(node.rightNode);
        }
        return;
    }

    public static void main(String[] args){
        //inser the node and link with each other
        Node root=new Node(1);
        root.leftNode=new Node(2);
        root.rightNode=new Node(3);
        root.rightNode.rightNode=new Node(4);
        printTree(root);
    }

}