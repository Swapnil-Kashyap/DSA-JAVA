public class leetcode1981 {
    static int solve(int sum , int target,int [][] mat,int row){
     if(row >=mat.length){
        return Math.abs(target-sum);
     }
     int mini = Integer.MAX_VALUE;
     for(int num: mat[row]){
        int ans = solve(sum + num,target,mat , row+1);
        mini = Math.min(mini,ans);
     }
     return mini;
   }
    public int minimizeTheDifference(int[][] mat, int target) {
        int row = 0;
        int sum = 0;
        int ans = solve(sum ,target, mat , row);
        return ans;
    }
}
