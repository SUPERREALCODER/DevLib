package recursion;

public class reversearray {

    // Recursive function to reverse an array
    public static void reverse(int[] arr, int start, int end) {
        if (start >= end) {
            return; // Base case: if start index is greater than or equal to end index, stop recursion
        }

        // Swap elements at start and end indices
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call with updated indices
        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Example input
        reverse(array, 0, array.length - 1);
        
        // Print the reversed array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
