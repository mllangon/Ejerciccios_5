public class Ejer_13 {
    private static final int INSERTION_SORT_THRESHOLD = 7;

    public static void quicksort(int[] array) {
        quicksort(array, 0, array.length - 1, log2(array.length) * 2);
    }

    private static void quicksort(int[] array, int low, int high, int depthLimit) {
        int length = high - low + 1;

        if (length < INSERTION_SORT_THRESHOLD) {
            insertionSort(array, low, high);
            return;
        } else if (depthLimit == 0) {
            heapsort(array, low, high);
            return;
        }

        int pivot = medianOfThree(array, low, low + length / 2, high);
        int partition = partition(array, low, high, pivot);
        quicksort(array, low, partition - 1, depthLimit - 1);
        quicksort(array, partition + 1, high, depthLimit - 1);
    }

    private static int partition(int[] array, int low, int high, int pivot) {
        int left = low;
        int right = high;
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static int medianOfThree(int[] array, int a, int b, int c) {
        if (array[a] < array[b]) {
            if (array[b] < array[c]) {
                return array[b];
            } else if (array[a] < array[c]) {
                return array[c];
            } else {
                return array[a];
            }
        } else if (array[a] < array[c]) {
            return array[a];
        } else if (array[b] < array[c]) {
            return array[c];
        } else {
            return array[b];
        }
    }

    private static void insertionSort(int[] array, int low, int high) {
        for (int i = low + 1; i <= high; i++) {
            int value = array[i];
            int j = i - 1;
            while (j >= low && array[j] > value) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = value;
        }
    }

    private static void heapsort(int[] array, int low, int high) {
        // Implementación de heapsort
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int log2(int n) {
        return 31 - Integer.numberOfLeadingZeros(n);
    }

    public static void main(String[] args) {
        int[] array = { 5, 3, 8, 4, 2, 7, 1, 6 };
        quicksort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}