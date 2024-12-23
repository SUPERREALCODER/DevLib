import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    // Function to calculate the minimum swaps needed to sort an array
    private int minSwapsToSort(List<Integer> level) {
        int n = level.size();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = level.get(i);
        }
        
        // Pair array to hold value and original index
        int[][] indexedArr = new int[n][2];
        for (int i = 0; i < n; i++) {
            indexedArr[i][0] = arr[i]; // Value
            indexedArr[i][1] = i;     // Original index
        }
        
        // Sort by value
        Arrays.sort(indexedArr, Comparator.comparingInt(a -> a[0]));
        
        // Find cycles in the sorted arrangement
        boolean[] visited = new boolean[n];
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] || indexedArr[i][1] == i) {
                continue;
            }
            
            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = indexedArr[j][1];
                cycleSize++;
            }
            
            if (cycleSize > 1) {
                swaps += (cycleSize - 1);
            }
        }
        
        return swaps;
    }
    
    // Main function to calculate the minimum operations
    public int minimumOperations(TreeNode root) {
        if (root == null) return 0;
        
        // BFS for level order traversal
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int totalSwaps = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            
            // Process the current level
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            
            // Calculate swaps for this level
            totalSwaps += minSwapsToSort(level);
        }
        
        return totalSwaps;
    }
}
