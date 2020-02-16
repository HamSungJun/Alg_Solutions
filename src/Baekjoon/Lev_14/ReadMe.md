# BaekJoon - Level.10

## 정렬 알고리즘

1. `Selection Sort`
    ```java
    
       public void selectionSort(int[] dataIn) {
       
           for (int i = 0; i < dataIn.length - 1; i++) {
   
               int nextPos = i;
   
               for (int j = i + 1; j < dataIn.length; j++) {
   
                   if (dataIn[nextPos] > dataIn[j]) {
                       nextPos = j;
                   }
   
               }
   
               if (nextPos != i) {
                   swap(i, nextPos, dataIn);
               }
   
           }
   
       }
    
    ```

2. `Insertion Sort`
    ```java
    
       public void insertionSort(int[] dataIn) {
       
           for (int i = 1; i < dataIn.length; i++) {
   
               for (int j = i; j > 0; j--) {
   
                   if (dataIn[j - 1] > dataIn[j]) {
   
                       swap(j - 1, j, dataIn);
   
                   }
   
               }
   
           }
   
       }
    
    ```

3. `Bubble Sort`
    ```java
    
       public void bubbleSort(int[] dataIn) {
       
           for (int i = 0; i < dataIn.length; i++) {
   
               for (int j = i; j < dataIn.length - 1 - i; j++) {
   
                   if (dataIn[j] > dataIn[j + 1]) {
                       swap(j, j + 1, dataIn);
                   }
   
               }
   
           }
   
       }
    
    ```
   
4. `Merge Sort`
    ```java

       public void mergeSort(int left, int right, int[] dataIn) {
       
               if (left < right) {
       
                   int m = (right + left) >>> 2;
       
                   mergeSort(left, m, dataIn);
                   mergeSort(m + 1, right, dataIn);
       
                   merge(left, m, right, dataIn);
       
               }
       
           }
       
       public void merge(int left, int middle, int right, int[] dataIn) {
   
           int i = left;
           int j = middle + 1;
           int k = left;
           int[] tempArr = new int[dataIn.length];
   
           while (i <= middle && j <= right) {
               
               if (dataIn[i] <= dataIn[j]) {
                   
                   tempArr[k] = dataIn[i];
                   i++;
                   
               } else {
                   
                   tempArr[k] = dataIn[j];
                   j++;
                   
               }
               k++;
               
           }
   
           if (i > middle) {
   
               for (int l = j; l <= right; l++) {
   
                   tempArr[k++] = dataIn[l];
   
               }
   
           } else {
   
               for (int l = i; l <= middle; l++) {
   
                   tempArr[k++] = dataIn[l];
   
               }
   
           }
   
           for (int l = left; l <= right; l++) {
               dataIn[l] = tempArr[l];
           }
   
       }
   
    ```