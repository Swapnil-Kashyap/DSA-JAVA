public class Coutrecursion {
    public static void Counttarget(int arr[],int i,int target,int count){
        if(i>= arr.length){
            System.out.println("Count -" + count);
            return ;
        }
        if(arr[i] == target){
            count++;
        }
       Counttarget (arr, i+1, target,count);
    }
    public static void main(String[] args) {
        int arr[] = new int[]{10, 20, 30, 40, 50, 60};
        int i = 0;
        int target = 50;
        int count = 0;
         Counttarget(arr, i, target, target);
    }
}
