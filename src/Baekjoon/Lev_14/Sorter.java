package Baekjoon.Lev_14;

public class Sorter {

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

    public void insertionSort(int[] dataIn) {

        for (int i = 1; i < dataIn.length; i++) {

            for (int j = i; j > 0; j--) {

                if (dataIn[j - 1] > dataIn[j]) {

                    swap(j - 1, j, dataIn);

                }

            }

        }

    }

    public void bubbleSort(int[] dataIn) {

        for (int i = 0; i < dataIn.length; i++) {

            for (int j = i; j < dataIn.length - 1 - i; j++) {

                if (dataIn[j] > dataIn[j + 1]) {
                    swap(j, j + 1, dataIn);
                }

            }

        }

    }

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

    public void countSort(int[] dataIn) {

        /*
         * 배열 인덱스가 곧 입력받은 수가 되고 배열의 원소는 입력받은 수가 등장하는 횟수가 된다.
         * 입력받는 숫자의 범위가 좁다면 사용할 만한 알고리즘.
         */

    }

    public void swap(int i, int j, int[] dataIn) {

        int temp = dataIn[i];
        dataIn[i] = dataIn[j];
        dataIn[j] = temp;

    }

}
