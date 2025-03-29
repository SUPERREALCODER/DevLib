class sort{
    public int[] arr(int[] num){
        
        int high=num.length-1,low=0,mid=0,temp;
        while(mid<=high){
            if(num[mid]==0){
             temp=num[mid];
             num[mid]=num[low];
             num[low]=temp;
             mid++;
             low++;
            }   
        else if(num[mid]==2) { 
       temp=num[mid];
        num[mid]=num[high];
        num[high]=temp;
        high--;
        }
        else{
       mid++;
        }
    }

 

        return num;
    }
    public static void main(String[] args){
        sort sol=new sort();
        int[] num={0,1,1,0,1,2,1,2,1,2,0,0,0};
        
        int[] ne;
        ne = sol.arr(num);
        for(int i=0;i<ne.length;i++){
            System.out.println(ne[i]);
        }
       

    }
}