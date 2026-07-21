import java.util.*;
public class MatrixAssignment1 {
    public static void main(String args[]){
        int array [][] = { {4,7,8},{8,8,7} };

        int count7 = 0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array [i][j]==7){
                    count7++;
                }
            }
        }
        System.out.println("count of 7" + count7);
}
    }

