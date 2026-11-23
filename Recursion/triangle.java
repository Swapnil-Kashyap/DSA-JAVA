import java.util.List;
public class triangle {
     static int solve(List<List<Integer>> triangle,int rowIndex , int colIndex){
       if(rowIndex == triangle.size()-1){
         return triangle.get(rowIndex).get(colIndex);
       }
       int downAns = solve(triangle,rowIndex+1,colIndex);
       int diagonalAns = solve(triangle,rowIndex+1,colIndex+1);
       int finalAns = triangle.get(rowIndex).get(colIndex) + Math.min(downAns,diagonalAns);
       return finalAns;
    }
    public int minimumTotal(List<List<Integer>> triangle) {
       int rowIndex = 0;
       int colIndex = 0;
       int ans = solve(triangle,rowIndex,colIndex);
       return ans;
    }
    public static void main(String[] args) {

    }
}
