
import java.util.Map;
import java.util.HashMap;

class Solution{
    public int missing(int[] arr,int n){
        int c=1,i;
        Map<Integer,Integer> map = new HashMap<>();
        for( i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]+1));
            }
            else 
            {
                map.put(arr[i],1);
            }
        }
        for( i=1;i<=n;i++){
            if(map.containsKey(i))
            continue;

            c=0;
            break;
        }
        if(c==0)
            return i;
        return 0;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] arr = {1,2,3,4};
     
        
     int result = sol.missing(arr,5);
        
        // Print the result
        System.out.println(result);
    }
}