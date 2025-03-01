//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            // First array input
            String[] str1 = br.readLine().trim().split(
                " "); // Read the first line and split by spaces
            int n = str1.length;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str1[i]); // Convert each element to an integer
            }

            // Second array input
            String[] str2 = br.readLine().trim().split(
                " "); // Read the second line and split by spaces
            int m = str2.length;
            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(str2[i]); // Convert each element to an integer
            }

            Solution obj = new Solution();
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = obj.findUnion(a, b);
            for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// a,b : the arrays
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
       
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();

        // Merge both arrays while avoiding duplicates
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != a[i])
                    list.add(a[i]);
                i++;
            } else if (b[j] < a[i]) {
                if (list.isEmpty() || list.get(list.size() - 1) != b[j])
                    list.add(b[j]);
                j++;
            } else { // If both are equal, add one and move both pointers
                if (list.isEmpty() || list.get(list.size() - 1) != a[i])
                    list.add(a[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements from a[]
        while (i < a.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != a[i])
                list.add(a[i]);
            i++;
        }

        // Add remaining elements from b[]
        while (j < b.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != b[j])
                list.add(b[j]);
            j++;
        }

        return list;
    }
}
