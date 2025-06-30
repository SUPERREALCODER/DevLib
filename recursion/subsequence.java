

import java.util.ArrayList;

public class subsequence {

    static void printf(int ind,ArrayList<Integer> ds,int[] arr){

        if(ind>=arr.length){
            for(int i=0;i<ds.size();i++){
                System.out.print(ds.get(i));
            }
            System.out.println();
            return;


        }

        ds.add(arr[ind]);
        printf(ind+1,ds,arr);
        ds.remove(ds.size() - 1);

    

        printf(ind+1,ds,arr);
        
        

    }



    public static void main(String args[]){

        ArrayList<Integer> arr =new ArrayList<>();
        int[] arr1 = {3,1,2};
        printf(0,arr,arr1);


    }
    
}
