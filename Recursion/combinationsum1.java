import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationsum1 {
    static void solve(int[] candidate,int target,int index,List<List<Integer>> ans,List<Integer> output){
        if(target==0){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(index>=candidate.length || target<0){
            return;
        }
        output.add(candidate[index]);
        solve(candidate,target-candidate[index],index,ans,output);
        output.remove(output.size()-1);
        solve(candidate,target,index+1,ans,output);
    }
    public List<List<Integer>> combinationSum(int[] candidates,int target){
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        solve(candidates,target,0,ans,output);
        return ans;
    }
    public static void main(String[] args){
        combinationsum1 obj=new combinationsum1();
        int[] candidates={2,3,6,7};
        int target=7;
        System.out.println(obj.combinationSum(candidates,target));
    }
}