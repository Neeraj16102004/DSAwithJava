package DataStructures.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        //Binary Search Tree
        BinarySearchTree myBST = new BinarySearchTree();
        System.out.println("ROOT =" + myBST.root);
        myBST.insert(1);
        myBST.insert(2);
        myBST.insert(3);
        myBST.insert(4);
        System.out.println(myBST.contains(3));
    }
}
