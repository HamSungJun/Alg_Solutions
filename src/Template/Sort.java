package Template;

import java.util.Arrays;

public class Sort {

    public int[] arr1 = new int[]{3, 7, 1, 2, 4, 5, 6, 11};
    public int[] arr2 = new int[]{};
    public int[] arr3 = new int[]{0};
    public int[] arr4 = new int[]{-3, 1, 9, 5, 4, -2, -2};

    public void SelectionSort() {
        // 0번 인덱스 부터 n-1번 인덱스까지 최소 혹은 최대값으로 재정렬한다. O(n^2);

        int[] arr = this.arr1;

        // 오름차순 정렬
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            if (minPos != i) {
                swap(i, minPos, arr);
            }
        }

        System.out.println(Arrays.toString(arr));

        // 내림차순 정렬
        for (int i = 0; i < arr.length - 1; i++) {
            int maxPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[maxPos] < arr[j]) {
                    maxPos = j;
                }
            }
            if (maxPos != i) {
                swap(i, maxPos, arr);
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    public void BubbleSort() {
        // 자료와 다음자료가 원하는 순서로 배치되어 있지 않다면 swap O(n^2)
        int[] arr = this.arr1;

        // 오름차순 정렬
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1, arr);
                }

            }

        }

        System.out.println(Arrays.toString(arr));

        // 내림차순 정렬
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] < arr[j + 1]) {
                    swap(j, j + 1, arr);
                }

            }

        }

        System.out.println(Arrays.toString(arr));

    }

    public void InsertionSort() {
        // 1번 요소부터 n번 요소까지 자신의 이전까지 루프를 돌면서 이전요소가 나보다 크거나 작다면 swap
        // O(n^2);
        int[] arr = this.arr1;

        // 오름차순 정렬
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(j, j - 1, arr);
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        // 내림차순 정렬
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (arr[j - 1] < arr[j]) {
                    swap(j - 1, j, arr);
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    public void MergeSort(int[] arr, int left, int right) {

        if (arr.length <= 0) return;

        if (left < right) {

            int mid = (left + right) / 2;
            this.MergeSort(arr, left, mid);
            this.MergeSort(arr, mid + 1, right);
            this.Merge(arr, left, mid, right);

        }

    }

    public void Merge(int[] arr, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = 0;
        int temp[] = new int[right - left + 1];

        // 오름차순
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // 내림차순
        while (i <= mid && j <= right) {
            if (arr[i] > arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int l = left; l <= right; l++) {
            arr[l] = temp[l - left];
        }

    }

    public void swap(int i, int j, int[] arr) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}
