package recursion;

public class sumn {
    // Recursive function to calculate the sum of numbers from 1 to n
    public static int sum(int n) {
        
        if (n == 0) {
            return 0; // Base case: sum of 0 is 0
        }
        
        return n + sum(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        int number = 5; // Example input
        int result = sum(number);
        System.out.println("Sum of numbers from 1 to " + number + " is: " + result);
    }
    
}
