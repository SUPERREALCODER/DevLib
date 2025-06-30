package Dynamic_Programming;
import java.util.Scanner;
import java.util.Arrays;

public class intro{

    public static int fibo(int n,int dp[]){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
    }
    public static void main(String args[]){
        System.out.println("enter the array length");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       int arr[]=new int[n+1];
       Arrays.fill(arr,-1);
       int m=fibo(n,arr);
       System.out.print("and trhe number is"+m);


       in.close();
    }
}