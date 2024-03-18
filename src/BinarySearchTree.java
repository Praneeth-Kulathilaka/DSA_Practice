public class BinarySearchTree {
//    Node class creation
    static class node {
        int key;
        node left,right;
    }
//    New node creation
    static node newNode(int key){
        node temp = new node();
        temp.key = key;
        temp.left = temp.right = null;
        return temp;
    }
//    Insert data to tree
    static node insert(node node, int key){
        if (node==null){
            return newNode(key);
        }
//        if the key value is less than node value it will go to left side
        if (key<node.key){
            node.left = insert(node.left, key);
        }
//        otherwise it will go to right side
        if (key> node.key){
            node.right = insert(node.right,key);
        }
        return node;
    }
//    inorder traversal
    static void inorder(node root){
        if (root != null){
            inorder(root.left);
            System.out.print(" "+root.key);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        node root = null;

        root = insert(root,5);
        insert(root,15);
        insert(root,2);
        insert(root,12);
        insert(root,24);
        insert(root,10);
        insert(root,8);
        inorder(root);
    }
}
