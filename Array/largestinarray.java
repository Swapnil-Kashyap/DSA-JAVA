import java.util.*;
public class largestinarray{
    public static int getLargest (int numbers[]){
        int largest = Integer.MAX_VALUE;
        int smallest = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length;i++){
            if(largest< numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is :" + smallest);
        return largest;
    }
    public static void main (String args[]){
        int numbers [] = {1,2,6,3,5};
        System.out.println("largest value is :" + getLargest(numbers));
    }
}