public class maxinArray {
    public static void MaxArray(int arr[], int i, int maxi) {
        if (i >= arr.length) {
            System.out.println(maxi);
            return;
        }
        if (arr[i] > maxi) {
            maxi = arr[i];
        }
        MaxArray(arr, i + 1, maxi);
    }
     public static void main(String[] args) {
        int[] arr = new int[]{20, 40, 30, 50, 70, 5};
        int maxi = Integer.MIN_VALUE;
        MaxArray(arr, 0, maxi);
    }
}
