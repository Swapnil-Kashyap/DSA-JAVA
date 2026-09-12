public class LineraSearchRecursio {

    public static int FindTarget(int arr[], int i, int target) {
        if (i >= arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return FindTarget(arr, i + 1, target);
    }
    public static void main(String[] args) {
        int arr[] = new int[]{10, 20, 30, 40, 50, 60};
        int i = 0;
        int target = 50;
          System.out.print(FindTarget(arr, i, target));
    }
}
