import java.util.*;

public class Tree{

    static class Node{
        Node left;
        int data;
        Node right;

        public Node(int data){
            this.data=data;
        }
    }

    public static void printTree(Node node){
        System.out.println(node.data);
        if(node.left!=null){
            printTree(node.left);
        }
        if(node.right!=null){
            printTree(node.right);
        }
        return;
    }

    public static void main(String[] args){
        //inser the node and link with each other
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.right=new Node(4);
        printTree(root);
    }

}