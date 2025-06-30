package Dynamic_Programming;
import java.util.Scanner;

public class intro2{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number where you get fibonacci");
        int n=in.nextInt();
        int prev=0;
        int prev1=1;
        int curi=0;
        for(int i=2;i<=n;i++){
            curi = prev+prev1;
            prev = prev1;
            prev1=curi;
        }
        System.out.print("the fibonacci number"+curi);
        in.close();
    }
}