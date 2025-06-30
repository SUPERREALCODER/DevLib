

import java.util.ArrayList;

public class firstsumsubsequence {

    static boolean printf(int ind,ArrayList<Integer> ds,int[] arr,int k,int s){

        if(ind>=arr.length){
            
            if(s==k){

            for(int i=0;i<ds.size();i++){
                System.out.print(ds.get(i));
            }
            System.out.println();
        }
            return true;
        


        }

        ds.add(arr[ind]);
        if(printf(ind+1,ds,arr,k,s=s+arr[ind]) == true)
        return true;
        printf(ind+1,ds,arr,k,s=s+arr[ind]);
        ds.remove(ds.size() - 1);
        s=s-arr[ind];
    

        if(printf(ind+1,ds,arr,k,s)==true)
        return true;
        printf(ind+1,ds,arr,k,s);
        return false;
        
        

    }



    public static void main(String args[]){

        ArrayList<Integer> arr =new ArrayList<>();
        int[] arr1 = {3,1,2};
        printf(0,arr,arr1,3,0);


    }
    
}
