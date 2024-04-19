import java.util.Scanner;

public class BST_4 {
    static class node{
        int key;
        node left, right;
    }
    static node newNode(int key){
        node temp = new node();
        temp.key = key;
        temp.left = temp.right =null;
        return temp;
    }

    static node insert(node root,int key){
        if (root==null){
            return newNode(key);
        }
        if (root.key < key){
            root.right = insert(root.right,key);
        }
        if (root.key > key){
            root.left = insert(root.left,key);
        }
        return root;
    }
    static boolean search(node root, int key){
        if (root == null){
            return false;
        }
        if (root.key==key){
            return true;
        }
        if (root.key>key){
            return search(root.left,key);
        }
        return search(root.right,key);
    }

    static boolean ancestors(node root, int key){
        if (root == null){
            System.out.println("No ancestors");
            return false;

        }
        if (root.key == key){
            return true;
        }
        if (ancestors(root.left,key)||ancestors(root.right,key)){
            System.out.print(" " + root.key);
            return true;
        }
        return false;
    }
    static node LCA(node root, int key1, int key2){
        if (root==null){
            return root;
        }
        if (root.key < key1 && root.key < key2){
            return LCA(root.right,key1,key2);
        }
        if (root.key > key1 && root.key > key2){
            return LCA(root.left,key1,key2);
        }
        return root;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        node root = null;
        int n = 0;
        System.out.println("Enter number");
        int num = scan.nextInt();
        root = insert(root,num);
        while (n==0){
            System.out.println("Enter number");
            num = scan.nextInt();
            insert(root,num);
            System.out.println("Press 0 to add new: ");
            n = scan.nextInt();
        }
        n=0;

//        while (n==0){
//            System.out.println("Enter number to search");
//            num = scan.nextInt();
//            if (search(root,num)){
//                System.out.println("Found");
//            } else {
//                System.out.println("Not found");
//            }
//            System.out.println("Press 0 to add new: ");
//            n = scan.nextInt();
//        }
//
//        n=0;

//        while (n==0){
//            System.out.println("Enter number to search");
//            num = scan.nextInt();
//            ancestors(root, num);
//            System.out.println("\nPress 0 to add new: ");
//            n = scan.nextInt();
//        }
        while (n==0){
            System.out.println("Enter number to search");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            node lca = LCA(root, num1, num2);
            System.out.println(lca.key);
            System.out.println("\nPress 0 to add new: ");
            n = scan.nextInt();
        }
    }

}
