package DataStructures.BasicSorts;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] array){
        for(int i=0;i<array.length;i++){
            int minIndex = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            if(i!=minIndex){
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
      int[]  a = {2,4,3,1,5,6,7,9};
      selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
