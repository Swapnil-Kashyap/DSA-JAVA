import java.util.*;
public class invertedpyramid{
   public static void inverted_rotated_half_pyramid(int n){
    for(int i= 1;i<=n;i++){
        for(int j =1; j<=n-1; j++){
            System.out.print(" ");
        }
        for (int j=1;j<=1; j++){
            System.out.print("*");
        }
        System.out.println();

    }

   }
   public static void main (String args[]){
     inverted_rotated_half_pyramid(4);
   }
}