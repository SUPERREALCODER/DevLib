package recursion;

public class nnn {
    
    // Recursive function to print numbers from 1 to n
    public static void print(int n) {
        
        if (n > 0) {

            System.out.println(n);
          
            print(n- 1); // Recursive call
            
            
           // Print after the recursive call
        }
    }

     public static void main(String[] args) {
        int number = 5; // Example input
        print(number);
    }
    
}
