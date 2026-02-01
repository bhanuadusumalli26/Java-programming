
class Program1 {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int ans = searchInsert(nums, target);
        System.out.println(ans);
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                right = mid - 1;

            } else {
                left = mid + 1;
            }

        }
        return ans;

    }
}
