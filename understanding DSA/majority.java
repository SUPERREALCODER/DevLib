public class majority {
    public int major(int[] num){
        int cl=0,cut=0;
        int n=0;
        for(int i=0;i<num.length;i++){
            if(cut==0){
                cl=num[i];
                cut++;
            }
            else if(num[i]==cl){
                cut++;

            }
            else 
            cut--;
        }
        for(int i=0;i<num.length;i++){
          
            if(num[i]==cl){
                n++;
            }
            if(n>((num.length)/2))
            return cl;
        }
        return -1;
    }
    public static void main(String[] args){
        majority sol=new majority();
        int[] num={7,7,7,7,5,1,5,7,5,5,7,7,5,5,7,7,7,7,7};
        int ne;
        ne=sol.major(num);
        System.out.println(ne);

    }
}
