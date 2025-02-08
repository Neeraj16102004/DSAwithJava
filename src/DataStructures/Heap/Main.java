package DataStructures.Heap;

public class Main {
    public static void main(String[] args) {
        Heap2x heap = new Heap2x(3);
        heap.insert(1);
        heap.insert(2);
        heap.insert(3);

        System.out.println(heap.getHeap());
    }
}
