public class BST_1 {
    static class node{
        int key;
        node left,right;
    }

    static node newNode(int key){
        node node = new node();
        node.key = key;
        node.left = node.right = null;
        return node;
    }
    static node insert(node root, int key){
        if (root == null){
            return newNode(key);
        }
        if (root.key < key) {
            root.right = insert(root.right,key);
        }
        if (root.key > key){
            root.left = insert(root.left,key);
        }
        return root;
    }

    static node search (node root, int key){
        if (root == null || root.key == key){
            return root;
        }
        if (root.key < key){
            return search(root.right,key);
        }
        return search(root.left,key);

    }
    static void inorder(node root){
        if (root != null){
            inorder(root.left);
            inorder(root.right);
            System.out.print(root.key + " ");

        }
    }

    public static void main(String[] args) {
        node root = null;

        root = insert(root,50);
        insert(root,14);
        insert(root,12);
        insert(root,34);
        insert(root,96);
        insert(root,45);
        insert(root,22);
        insert(root,14);

        inorder(root);

        int key = 62;

        if (search(root,key) == null){
            System.out.println(" \n" + key + " not found");
        } else {
            System.out.println(" \n" + key + " found");
        }


    }
}
