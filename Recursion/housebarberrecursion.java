public class housebarberrecursion {
    static int solve(int[] nums, int index) {
        if (index >= nums.length) {
            return 0;
        }
        int includeAns = nums[index] + solve(nums, index + 2);
        int excludeAns = solve(nums, index + 1);
        return Math.max(includeAns, excludeAns);
    }
    public static int rob(int[] nums) {
        return solve(nums, 0);
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        int ans = rob(nums);
        System.out.println(ans);
    }
}