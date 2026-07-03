package BinaryTree;
import java.util.*;
public class PreOrder{
    static class Node {
    
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree {
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            // create new node
            Node newNode=new Node(nodes[idx]);
            // create first left node
            newNode.left=buildTree(nodes);
            // create right node
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root= tree.buildTree(nodes);
        System.out.println(root.data);
    }
}