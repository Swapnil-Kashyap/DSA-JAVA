public class power0f2 {
    public static int power (int n){
        if(n == 0){
            return 1;
        }
        int ans = 2 * power(n-1);
        return ans;
    }
    public static void main(String[] args) {
         int n = 5;
        long result = power(n);
        System.out.println("power of " + n + " = " + result);
    }
}
