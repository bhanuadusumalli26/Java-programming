def maxSumSub(arr, n):
    maxSum = arr[0]
    currSum = arr[0]
    for i in range(1, n):
        currSum = max(arr[i], currSum + arr[i])
        maxSum = max(maxSum, currSum)
    return maxSum


arr = [-2, -3, 4, -1, -2, 1, 5, -3]
n = len(arr)
print(maxSumSub(arr, n))
# output 7
# Time Complexity: O(n)
# Space Complexity: O(1)
# This is Kadane's Algorithm
# https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
