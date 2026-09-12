public class printname10 {
    public static void printMyName(int n){
        if(n==0){
            return ;
        }
        System.out.println("Mahi");
        printMyName(n-1);
    }
    public static void main(String[] args) {
        printMyName(10);
    }
}
