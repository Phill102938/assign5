public class QuickSort {

    public static void main(String[] args) {
        int[] array = {3,1,8,7,6,2,4,9,5};

        showArray(array);
        quickSort(array);
        showArray(array);
    }

    public static void showArray(int[] theArray) {
        int index;

        System.out.printf("[");
        for(index = 0; index < theArray.length; index++) {
            if(index != 0) {
                System.out.printf(", ");
            }
            System.out.printf("%d", theArray[index]);
        }
        System.out.printf("]\n");
    }

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int left, int right) {
        if(left < right) {
            int pivotIndex = partition(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;

        for(int j = left; j < right; j++) {
            if(array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, right);
        return i + 1;
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}

