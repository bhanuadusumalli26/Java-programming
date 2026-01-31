
class Program2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int result = lowerBound(arr, target);
        System.out.println(result); // Output: 4
    }

    public static int lowerBound(int[] arr, int target) {
        int left = 0;
        int n = arr.length;
        int right = arr.length - 1;
        int ans = n;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
}
//Time Complexity: O(log n)
//Space Complexity: O(1)
//This program finds the lower bound of a target value in a sorted array using binary search. The lower bound is the index of the first element in the array that is greater than or equal to the target value.
