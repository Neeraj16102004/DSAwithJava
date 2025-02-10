package DataStructures.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        //Binary Search Tree
        BinarySearchTree myBST = new BinarySearchTree();
        System.out.println("ROOT =" + myBST.root);
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.rInsert(27);
        myBST.rInsert(52);
        myBST.rInsert(82);

        System.out.println(myBST.rContains(2));
        System.out.println( myBST.BFS());
        System.out.println(myBST.DFSPreOrder());
        System.out.println(myBST.DFSPostOrder());
        System.out.println(myBST.DFSInOrder());
    }
}
