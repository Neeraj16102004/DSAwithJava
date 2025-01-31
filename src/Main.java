import DataStructures.DoubleyLinkedList;

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
       DoubleyLinkedList list = new DoubleyLinkedList(1);
        list.printList();
        System.out.println(" ");
        list.prepend(6);
        list.printList();
        list.remove(5);
        list.printList();;
    }
}