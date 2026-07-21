import java.util.*;
public class Stringassignment2 {
    public static void main (String args[]){
        String str1 = "race";
        String str2 = "care";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        if(str1.length() == str2.length()){
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str1.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            boolean results = Arrays.equals(str1charArray,str2charArray);
            if(results){
               System.out.print(str1 + "and" + str2 + "are anagrams of each other");
            } else{
                System.out.print(str1 + "and" + str2 + "are not anagrams of each others");
            } 

        }

    }
}
