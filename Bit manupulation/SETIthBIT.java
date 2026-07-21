import java.util.*;
public class SETIthBIT {
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n;
    }
    public static void main (String args[]){
        System.out.println(setIthBit(10,2));
    }
}