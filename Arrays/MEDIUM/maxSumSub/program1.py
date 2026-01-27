import sys


def maxSumSubArray(arr, n):
    maxi = -sys.maxsize - 1
    for i in range(n):
        for j in range(i, n):
            sum = 0
            for k in range(i, j + 1):
                sum += arr[k]
                maxi = max(maxi, sum)
    return maxi


# Driver Code
arr = [1, -2, 3, 10, -4, 7, 2, -5]
n = len(arr)
print(maxSumSubArray(arr, n))
# Output: 18
# timeComplexity: O(n^3)
# spaceComplexity: O(1)
# Approach: Brute Force
# Explanation: We are using three nested loops to find the maximum sum of subarray.
# We are initializing the maxi variable with the minimum possible value.
# Then, we are iterating through the array using three nested loops.
# In the innermost loop, we are calculating the sum of the subarray and updating the maxi variable if the sum is greater than the current value of maxi.
# Finally, we are returning the value of maxi.
# Note: This approach is not efficient for large arrays as it has a time complexity of O(n^3).
