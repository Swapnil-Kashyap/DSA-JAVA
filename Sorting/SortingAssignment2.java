import java.util.*;
public class SortingAssignment2{
    public static void selectionSort (int arr[]){
        for(int i =0;i<arr.length-2;i++){
            int minpos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]<arr[j]){
                    minpos = j;
                }

            }
            int temp = arr[ minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }

    }
    public static void main (String args[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        selectionSort(arr);
       System.out.println(Arrays.toString(arr));
    }
}