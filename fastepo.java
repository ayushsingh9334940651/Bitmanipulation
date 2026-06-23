package Bitmanipalution;
import java.util.*;
public class fastepo {
    public static void main(String[] args){
        Scanner sec=new Scanner(System.in);
        System.out.println("Enter base of exponentiatonal");
        int a=sec.nextInt();
        System.out.println("Enter power of exponentiational");
        int n=sec.nextInt();
        // all operation and function are applied on exponentiational pow;
         int ans=1;
        while(n>0){
          if((n&1)!=0){
            ans=ans*a;
          }
          a*=a;
         n=n>>1;
        }
        System.out.println(ans);
        sec.close();
    }
}
