public class Subsequencesum {
    static boolean solve(int[] arr, int k,int sum, int index){
        if(index >= arr.length){
            if(sum == k)
                return true;
            else
                return false;
        }
        int curValue = arr[index];
        boolean excludekaAns = solve(arr,k,sum,index +1);
        boolean includekaAns = solve(arr,k,sum + curValue, index+1);
        boolean finalAns = includekaAns || excludekaAns ;
        return finalAns;
    }
   
    public  boolean checkSubSequence(int[] arr, int k){
        int index = 0;
        int sum = 0;
        boolean ans = solve(arr,k,sum,index);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 5;
        Subsequencesum obj = new Subsequencesum();
        boolean ans = obj.checkSubSequence(arr, k);
        System.out.println(ans);
    }
}
