import java.util.*;
public class largestnumber {
    public static void main ( String args []){
        int a= 1,b=3, c= 6 ;

        if ((a>=b) && (a>=c)){
            System.out.println("a is largest number");
        } else if (b>=c){
            System.out.println("b is largest number");
        } else {
            System.out.println("c is largest number");
        }
    }
}