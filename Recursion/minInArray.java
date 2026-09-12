public class minInArray {
        public static void MaxArray(int arr[], int i, int mini) {
        if (i >= arr.length) {
            System.out.println(mini);
            return;
        }
        if (arr[i] < mini) {
            mini = arr[i];
        }
        MaxArray(arr, i + 1, mini);
    }
     public static void main(String[] args) {
        int[] arr = new int[]{20, 40, 30, 50, 70, 5};
        int mini = Integer.MAX_VALUE;
        MaxArray(arr, 0, mini);
    }
}

