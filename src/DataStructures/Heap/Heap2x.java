package DataStructures.Heap;

import java.util.ArrayList;
import java.util.List;

public class Heap2x {
    private List<Integer> heap;
    private int numChild;
    public Heap2x(int x){
        this.heap = new ArrayList<>();
        this.numChild = (int)Math.pow(2,x);
    }
    private int parent(int i) {
        return (i - 1) / numChild;
    }

    private int child(int i, int j) {
        return numChild * i + j;
    }
    public List<Integer> getHeap(){
        return new ArrayList<>(heap);
    }
    private void swap(int index1,int index2){
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2,temp);
    }
    public void insert(int value){
        heap.add(value);
        int current = heap.size()-1;

        while(current>0&&heap.get(current)>heap.get(parent(current))){
            swap(current,parent(current));
            current = parent(current);
        }
    }
    public  Integer remove(){
        if(heap.size()==0){
            return  null;
        }
        if(heap.size()==1){
            return heap.remove(0);
        }
        int maxValue = heap.get(0);
        heap.set(0,heap.remove(heap.size()-1));
        sinkDown(0);

        return  maxValue;
    }
    private void sinkDown(int i) {
        int largest = i;

        for (int j = 0; j < numChild; j++) {
            int childIndex = child(i, j);
            if (childIndex < heap.size() && heap.get(childIndex) > heap.get(largest)) {
                largest = childIndex;
            }
        }

        if (largest != i) {
            swap(i, largest);
            sinkDown(largest);
        }
    }
}
