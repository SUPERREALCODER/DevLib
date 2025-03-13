import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    
    public ArrayList<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
         ArrayList<Integer> keyList = new ArrayList<>(map.values());
        return keyList;
        
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] arr = {2, 3, 2, 3, 5};
     
        
        ArrayList<Integer> result = sol.frequencyCount(arr);
        
        // Print the result
        System.out.println(result);
    }
}
