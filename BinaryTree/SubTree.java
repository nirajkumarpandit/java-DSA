package BinaryTree;

public class SubTree {
    static class  Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    //check the subTree is identical
    public static boolean isIdentical(Node root , Node subRoot){
        //check root and subRoot null ho to return true
        if(root==null && subRoot==null){
            return true;
        } 
        // ye sab non identical ke properties hai

        // agar koi ek null hai to identical nahi hai or root and subRoot ke data agar same nahi ho to false
        else if(root==null || subRoot==null || root.data !=subRoot.data){
            return false;
        }
        // agar root same hai to left me same process karo and right me bhi
        if(!isIdentical(root.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(root.right, subRoot.right)){
            return false;
        }
        // ye sab ager nahi huaa to ye identical hai
        return true;
    }
    // check isSubtree
    public static boolean isSubtree(Node root , Node subRoot){
        // if root null ho
        if(root==null) return false;
        //if root node dono ke equal ho
        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        // agar root same hai to left and right me same process
        // but pahle left me check karenge agar mila to retur ho jayega nahi to right me check karenge
        return isIdentical(root.left, subRoot) || isIdentical(root.right, subRoot);
    }
    public static void main(String[] args) {
       // Tree hai 
        Node root =new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.right=new Node(6);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        // subTree
        Node subRoot =new Node(2);
        subRoot.left=new Node(4);
        subRoot.right=new Node(5);

        // fuction call
        System.out.println(isSubtree(root, subRoot));
    }
}
