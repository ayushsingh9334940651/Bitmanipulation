package Bitmanipalution;

public class problem {
      public static void main(String[] args){
        int n=15;
        int i=0;
        int j=2;
        int a=(~0)<<(j+1);
        int b=(int) (Math.pow(2,i)-1);
        //int b=(1<<(i))-1;
        n=n & a|b;
        System.out.println(n);
      }
}
