import DataStructures.DoubleyLinkedList;
import DataStructures.Queue;
import DataStructures.Stack;

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
     //  DoubleyLinkedList list = new DoubleyLinkedList(4);
       //list.append(1);
      // list.prepend(3);
       //list.makeEmpty();

      // list.printAll();

        //Stack

      //  Stack stack = new Stack(1);
      //  stack.push(2);
      //  stack.pop();
      //  stack.printStack();

        //Queue

        Queue queue = new Queue(1);
        queue.enqueue(2);
        queue.dequeue();
        queue.printQueue();

    }
}