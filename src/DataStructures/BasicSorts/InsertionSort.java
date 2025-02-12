package DataStructures.BasicSorts;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array){
        for(int i=0;i<array.length;i++){
            int temp = array[i];
            int j = i-1;
            while(j>-1&&temp<array[j]){
                array[j+1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
         int[] a = {1,5,4,3,7,8,9};
         insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
