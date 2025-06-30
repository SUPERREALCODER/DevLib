
import java.util.ArrayList;

public class revision1 {
    public static void revision(int []arr,ArrayList<Integer> ds,int ind){

        if(ind>=arr.length){
            for(int i=0;i<ds.size();i++){
                System.out.print(ds.get(i));
            }
            System.out.println();
        }

        ds.add(arr[ind]);
        revision(arr, ds, ind+1);
        ds.remove(ds.size()-1);
        revision(arr,ds,ind+1);


    }
    public static void main(String args[]){
        int arr[] ={3,2,1};
        ArrayList<Integer> ds=new ArrayList<>();
        revision(arr,ds,0);


        



    }
}
