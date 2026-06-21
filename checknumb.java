package Bitmanipalution;

public class checknumb {
    public static void evenodd(int a){
        if((a&1)==0){
         System.out.println("even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args){
        int a=6;
        evenodd(a);
    }
}
