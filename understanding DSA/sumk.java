import java.util.Map;
import java.util.HashMap;
class sumk {
    public int sum(int[] arr,int k){
        Map<Integer,Integer> map=new HashMap<>();
        int s=0,len=0;
        for(int i=0;i<arr.length;i++){
            s=s+arr[i];
            map.put(s,i);

            if(s==k){
                len=Math.max(len,i+1);
            }

            if(map.containsKey(s-k)){
                len=Math.max(len,i-map.get(s-k));
            }
            


        }

        return len;
    }

    public static void main(String[] args){
         sumk sol = new sumk();
        
        int[] arr = {1,2,3,1,1,1,1,3,3};
     
        
        int result = sol.sum(arr,6);
        
        // Print the result
        System.out.println(result);
    }
    }

