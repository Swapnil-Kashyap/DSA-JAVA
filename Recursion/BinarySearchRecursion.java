public class BinarySearchRecursion {
    static int solve(int arr[], int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return solve(arr, target, s, mid - 1);
        }
        return solve(arr, target, mid + 1, e);
    }
    public static int binarysearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        return solve(arr, target, s, e);
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int target = 40;
        System.out.println(binarysearch(arr, target));
    }
}