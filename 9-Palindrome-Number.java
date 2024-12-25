class Solution {
    static public boolean isPalindrome(int x) {
        int i=x;
        int d,r=0;
        while(i!=0)
        {
            d=i%10;
            r=r*10+d;
            i=i/10;

        }
        if(x>=0){
        if(x == r)
        return true;
        else 
        return false;
        }
        else 
        return false;
        
    }
    public static void main(String[]args){
      System.err.println(isPalindrome(121));
    }
}