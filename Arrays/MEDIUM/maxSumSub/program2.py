import sys


def maxSumSubArray(arr, n):
    maxSum = -sys.maxsize
    for i in range(n):
        currSum = 0
        for j in range(i, n):
            currSum += arr[j]
            if currSum > maxSum:
                maxSum = currSum

    return maxSum


# Driver Code
arr = [1, -2, 3, 10, -4, 7, 2, -5]
n = len(arr)
print(maxSumSubArray(arr, n))
# Time Complexity: O(n^2)
# Space Complexity: O(1)
# This is a brute force approach
# Explanation: We are iterating through the array and finding the maximum sum of subarray by adding elements one by one.
# We are keeping track of the maximum sum and updating it whenever we find a larger sum.
