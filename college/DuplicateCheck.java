// public class ExceptionDemo {
//     public static void  main(String[] args) {

//         // i. ArithmeticException
//         try {
//             int a = 10;
//             int b = 0;
//             int result = a / b;  // Division by zero
//             System.out.println("Result: " + result);
//         } catch (ArithmeticException e) {
//             System.out.println("Caught ArithmeticException: " + e.getMessage());
//         }

//         // ii. ArrayIndexOutOfBoundsException
//         try {
//             int[] arr = {1, 2, 3};
//             System.out.println("Accessing 5th element: " + arr[4]);  // Invalid index
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
//         }

//         // iii. NumberFormatException
//         try {
//             String s = "abc123";
//             int num = Integer.parseInt(s);  // Invalid conversion
//             System.out.println("Converted number: " + num);
//         } catch (NumberFormatException e) {
//             System.out.println("Caught NumberFormatException: " + e.getMessage());
//         }

//         System.out.println("\nProgram continues normally after exception handling.");
//     }
// }

import java.util.Scanner;

class DuplicateException extends Exception {
    public DuplicateException(String message) {
        super(message);
    }
}

public class DuplicateCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5]; // Fixed size array for demonstration

        System.out.println("Enter 5 unique numbers:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = sc.nextInt();

            try {
                // Check for duplicates before adding
                for (int j = 0; j < i; j++) {
                    if (arr[j] == num) {
                        throw new DuplicateException("Duplicate number " + num + " entered!");
                    }
                }
                arr[i] = num;
            } catch (DuplicateException e) {
                System.out.println("Exception Caught: " + e.getMessage());
                i--; // Decrease index to allow retry
            }
        }

        // Display unique values
        System.out.println("\nUnique numbers entered:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
