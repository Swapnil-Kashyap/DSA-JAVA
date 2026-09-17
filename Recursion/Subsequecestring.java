import java.util.*;
public class Subsequecestring {
    static void getallsubsequence(String s,int index,StringBuilder output,List<String> ans){
        if(index >= s.length()){
            String subsequence = output.toString();
            ans.add(subsequence);
            return;
        }
        char ch = s.charAt(index);
        output.append(ch);
        getallsubsequence(s, index +1, output, ans);
        output.deleteCharAt(output.length()-1);
        getallsubsequence(s, index +1, output, ans);
    }
    public List<String>powerSet(String s){
        List<String> ans = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        int index = 0;
        getallsubsequence(s, index, output, ans);
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        Subsequecestring obj = new Subsequecestring();
 System.out.println(obj.powerSet("abc"));
    }
}
