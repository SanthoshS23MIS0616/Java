/*
Question:
How can you create SortStrategy with BubbleSortStrategy and MergeSortStrategy, and a Sorter class that swaps strategies at runtime?
*/
import java.util.Arrays;

interface SortStrategy {
    void sort(int[] arr);
}

class BubbleSortStrategy implements SortStrategy {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class MergeSortStrategy implements SortStrategy {
    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
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

        for (int value : temp) {
            arr[left++] = value;
        }
    }
}

class Sorter {
    private SortStrategy strategy;

    Sorter(SortStrategy strategy) {
        this.strategy = strategy;
    }

    void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    void sort(int[] arr) {
        strategy.sort(arr);
    }
}

class StrategyPattern {
    public static void main(String[] args) {
        int[] first = {5, 2, 9, 1, 3};
        int[] second = {8, 4, 7, 6, 2};

        Sorter sorter = new Sorter(new BubbleSortStrategy());
        sorter.sort(first);
        System.out.println("Bubble sort: " + Arrays.toString(first));

        sorter.setStrategy(new MergeSortStrategy());
        sorter.sort(second);
        System.out.println("Merge sort: " + Arrays.toString(second));
    }
}
