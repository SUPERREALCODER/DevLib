//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            int ans = obj.dataTypeSize(s);
            String Character = "Character";
            if (Character.equals(s) && ans == 2) {
                ans = 1;
            }
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int dataTypeSize(String str) {
        // code here
        int a;
        if(str.compareTo("Character")==0)
        {
            a=1;
        return a;
        }
        else if(str.compareTo("Integer")==0 ){
            a=4;
        return a;
        }
        else if (str.compareTo("Long")==0)
        {
            a=8;
        return a;
        }
        else if(str.compareTo("Float")==0)
        {
            a=4;
        return a;
        }
        else if(str.compareTo("Double")==0)
        {
            a=8;
        return a;
        }
        else 
        {
            a=-1;
        return a;
        }
    }
}