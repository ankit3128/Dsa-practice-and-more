public class DividenConquer {
    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int s, int e) {
        if (s >= e) return; // Base case: one element

        int mid = s + (e - s) / 2;

        mergeSort(arr, s, mid);     // left part  
        mergeSort(arr, mid + 1, e); // right part

        merge(arr, s, mid, e);
    }

    public static void merge(int arr[], int s, int mid, int e) {
        int temp[] = new int[e - s + 1];

        int i = s;      // iterator for left 
        int j = mid + 1; // iterator for right
        int k = 0;      // iterator for temp arr

        while (i <= mid && j <= e) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // left over elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right over elements
        while (j <= e) {
            temp[k++] = arr[j++];
        }

        // copy temp back to original arr
        for (k = 0, i = s; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
