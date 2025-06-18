import java.util.Scanner;
public class fractKnap {

    public static double fractionalKnapsack(int[] weights, int[] values, int capacity) {
        double[][] ratio = new double[weights.length][2];

        for (int i = 0; i < weights.length; i++) {
            ratio[i][0] = (double) values[i] / weights[i]; // value/weight ratio
            ratio[i][1] = i; // index of the item
        }

        // Sort items by value/weight ratio in descending order
        java.util.Arrays.sort(ratio, (a, b) -> Double.compare(b[0], a[0]));

        double maxValue = 0.0;
        for (int i = 0; i < ratio.length; i++) {
            int index = (int) ratio[i][1];
            if (capacity >= weights[index]) {
                // If the whole item can be added
                maxValue += values[index];
                capacity -= weights[index];
            } else {
                // If only part of the item can be added
                maxValue += ratio[i][0] * capacity;
                break; // Knapsack is full
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items:");
        int n = sc.nextInt();
        int[] weights = new int[n];
        int[] values = new int[n];
        System.out.println("Enter the weights of the items:");
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }


        System.out.println("Enter the values of the items:");
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }   
        
        System.out.println("Enter the capacity of the knapsack:");
        int capacity = sc.nextInt();        
        sc.close(); 

        double maxValue = fractionalKnapsack(weights, values, capacity);
        System.out.println("Maximum value in Knapsack = " + maxValue);
    }
    
}
