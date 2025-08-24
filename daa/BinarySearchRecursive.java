public class BinarySearchRecursive {

    public static int binarySearch(int[] arr, int left, int right, int target) {
if (left > right) {
            return -1; 
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return binarySearch(arr, left, mid - 1, target);
        }
        return binarySearch(arr, mid + 1, right, target);
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 7, 10, 15, 20, 35, 50};
        int target = 15;

        int index = binarySearch(numbers, 0, numbers.length - 1, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
