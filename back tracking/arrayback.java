public class arrayback {

    // Method to print the array
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to change array recursively
    public static void changeArr(int[] arr, int i, int val) {
        // base case
        if (i == arr.length) {
           // print current state
            return;
        }

        // recursion work
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;  // backtrack
    }

    public static void main(String args[]) {
        int[] arr = new int[5];
        printArr(arr);  // initial state
        changeArr(arr, 0, 1);
        printArr(arr);  // final state after backtracking
    }
}
