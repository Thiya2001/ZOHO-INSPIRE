import java.util.Random;
public class SortingPerformanceComparison {
    public static void main(String[] args) {
        int n = 10000; 
        int[] arr = new int[n];

        Random r = new Random();
        for(int i = 0; i < n; i++) {
            arr[i] = r.nextInt(100000);
        }

        int[] bubbleArr = arr.clone();
        int[] selectionArr = arr.clone();
        int[] insertionArr = arr.clone();
        int[] quickArr = arr.clone();

        // Bubble Sort
        long start = System.currentTimeMillis();
        bubbleSort(bubbleArr);
        long end = System.currentTimeMillis();
        System.out.println("Bubble Sort Time : " + (end - start) + " ms.");

        // Selection Sort
        start = System.currentTimeMillis();
        selectionSort(selectionArr);
        end = System.currentTimeMillis();
        System.out.println("Selection Sort Time : " + (end - start) + " ms.");

        // Insertion Sort
        start = System.currentTimeMillis();
        insertionSort(insertionArr);
        end = System.currentTimeMillis();
        System.out.println("Insertion Sort Time : " + (end - start) + " ms.");

        // Quick Sort
        start = System.currentTimeMillis();
        quickSort(quickArr, 0, quickArr.length - 1);
        end = System.currentTimeMillis();
        System.out.println("Quick Sort Time : " + (end - start) + " ms.");
    }

    // Bubble Sort
    static void bubbleSort(int[] a) {
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = 0; j < a.length - 1 - i; j++) {
                if(a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    static void selectionSort(int[] a) {
        for(int i = 0; i < a.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < a.length; j++) {
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }

    // Insertion Sort
    static void insertionSort(int[] a) {
        for(int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while(j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    // Quick Sort
    static void quickSort(int[] a, int low, int high) {
        if(low < high) {
            int pi = partition(a, low, high);
            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }

    static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;

        for(int j = low; j < high; j++) {
            if(a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;
    }
}
