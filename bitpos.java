package Bitmanipalution;

public class bitpos {
    public static int getIthposition(int a,int i){
        int change=1<<(i);
        if((a&change)==change){
            return 1;
        }
        return 0;
    }
    public static void setIthbit(int n,int i){
        int change=1<<(i);
        System.out.println("number before set operation_"+n);
        n=n|change;
        System.out.println("number after set operation_"+n);
    }
    public static void clearIthbit(int n,int i){
      int change=~(1<<(i));
      System.out.println("number before clear operation_"+n);
        n=n&change;
      System.out.println("number after clear operation_"+n);
    }
    public static void clearstartnth(int n,int i){
        int change=~0;
        System.out.println("number before clear upto start nth "+n);
        n=n&change<<(i);
      System.out.println("number after clear upto start nth "+n);
    }
    public static void clearrangerbit(int n,int i,int j){
        int a =~0<<(j+1);
        //int b=(1<<j)-1;
        int b=(int) Math.pow(2,i)-1;
        
      System.out.println("number before clear range  nth "+n);
       n=n& a|b;
      System.out.println("number after clear range  nth "+n);
    }
    
    public static void main(String[] args){
     int a=15;
     int i=2;
     int j=6;
     System.out.println(getIthposition(a,i));
     setIthbit(a,i);
     clearIthbit(a,i);
     clearstartnth(a,i);
     clearrangerbit(a,i,j);
    }
}
