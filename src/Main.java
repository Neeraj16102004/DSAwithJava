import DataStructures.DoubleyLinkedList;
import DataStructures.LinkedList;

public class Main {
    public static void main(String[] args) {
       //LinkedList
      //  LinkedList myList = new LinkedList(4);

      //  myList.getHead();
      //  myList.append(3);
       // myList.printList();
     //   myList.removeLast();
     //   myList.printList();
     //   myList.prepend(1);
      //  myList.printList();
       // myList.removeFirst();
       // myList.printList();

        //DoubleyLinkedList
        DoubleyLinkedList myList1 = new DoubleyLinkedList(4);
        myList1.printList();
        System.out.println(" ");
        myList1.append(6);
        myList1.append(5);
        myList1.printList();
      //  System.out.println(myList1.removeLast());
    }
}