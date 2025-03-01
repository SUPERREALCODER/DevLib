//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            Solution ob = new Solution();
            int ans = ob.sumOfDivisors(N);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int sumOfDivisors(int n) {
        // code here
        int F=0,c=1;
        for(int i=2;i<=n;i++){
            
            for(int j=1;j*j<=i;j++){
                if(i%j == 0){
                    F=F+j;
                    if(i/j != j)
                    F=F+(i/j);
                }
            }
            c=c+F;
            F=0;
        }
        return c;
    }
}