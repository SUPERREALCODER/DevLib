package recursion;
class recu {

    // Recursive function to calculate factorial
    public static void print(int n) {
        if(n>0){
            print(n - 1); // Recursive call
            System.out.print(n + " "); // Print after the recursive call

        }
    }

    public static void main(String[] args) {
        int number = 5; // Example input
       print(number);
    }
}