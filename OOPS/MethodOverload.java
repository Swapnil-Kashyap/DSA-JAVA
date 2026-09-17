public class MethodOverload {
    int add(int a, int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(int a,int b, int c, double d){
        return a + b + c + d ;
    }
    public static void main(String[] args) {
        MethodOverload c = new MethodOverload();
        System.out.println(c.add(2,3,4));
    }
}
