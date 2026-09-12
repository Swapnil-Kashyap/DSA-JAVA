public class Factorial{
   public static  long factorial(int num){
    if(num == 0){
        return 1;
    }
    long ans = num * factorial(num-1);
     return ans;
   }
    public static void main(String[] args) {
        int num = 5;
        long result = factorial(num);
        System.out.println("Factorial of " + num + " = " + result);
    }
}