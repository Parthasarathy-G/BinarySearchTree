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

    class Node {
        int data;
        Node right, left;

        public Node(int data) {
            this.data = data;
            right = left = null;
        }
    }
}
