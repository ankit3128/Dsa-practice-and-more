

import java.util.ArrayList;

public class max1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i <= arr.length - k; i++) {
            int max = arr[i];
            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            res.add(max);
        }

          // Output the result
        for (int a = 0; a < res.size(); a++) {
            System.out.println(res.get(a));
    }
    }}
