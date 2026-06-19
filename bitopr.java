package Bitmanipalution;

public class bitopr {
public static void powerof2(int n){
     if((n&(n-1))==0){
       System.out.println( n+" number is power of 2");
     }
     else{
        System.out.println(n+" number is not power of 2");
     }
    }
    public static void countset(int n){
    int counter=0;
    while(n>0){
     if((n&1)==1){
        counter++;
     }
     n=n>>1;
    }
    System.out.println("number of set in binearynumber"+counter);
    }
    public static void main(String[] args){
      int a=10;
      powerof2(a);
      countset(a);
    }
}
