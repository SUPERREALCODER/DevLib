package recursion;

public class factorial {
    
    // Recursive function to calculate factorial of n
    public static int factorial(int n) {
        
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        
        return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        int number = 5; // Example input
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
