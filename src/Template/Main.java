package Template;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Sort S = new Sort();
//        S.SelectionSort();
//        S.BubbleSort();
//        S.InsertionSort();

        S.MergeSort(S.arr1, 0, S.arr1.length-1);
        System.out.println(Arrays.toString(S.arr1));

    }

}
