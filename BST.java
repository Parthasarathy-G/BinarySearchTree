package Vakil;

public class BST {
    Node root;

    public static void main(String[] args) {
        BST bin = new BST();
        bin.add(100);
        bin.add(200);
        bin.add(300);
        bin.add(400);
        bin.add(500);
        bin.preorder();
        bin.inorder();
    }

    public void add(int data) {
        if (root == null) {
            root = new Node(data);
        }
        else{
            if(data>root.data){
                root.right = add(data,root.right);
            }
            else{
                root.left = add(data,root.left);

            }
        }
    }
    private Node add(int data,Node temp){
        if(temp==null){
            temp = new Node(data);
        }
        else{
            if(data>temp.data){
                temp.right = add(data,temp.right);
            }
            else{
                temp.left = add(data,temp.left);
            }
        }
            return temp;
    }
    public void inorder(){
        if(root!=null){
            System.out.print(root.data+" ");
            inorder(root.left);
            inorder(root.right);
            System.out.println();
        }
    }
    private void inorder(Node temp){
        if(temp==null)
            return;
            System.out.print(temp.data+" ");
        inorder(temp.left);
        inorder(temp.right);
    }
    public void preorder(){
        if(root!=null){
            preorder(root.left);
            preorder(root.right);
            System.out.print(root.data+" ");
            System.out.println();
        }
    }
    private void preorder(Node temp){
        if(temp==null)
            return;
        preorder(temp.left);
            System.out.print(temp.data+" ");
        preorder(temp.right);
    }

    class Node {
        int data;
        Node right, left;

        public Node(int data) {
            this.data = data;
            right = left = null;
        }
    }
}
