def majorityElement(arr, n):
    count = 0
    for i in range(n):
        for j in range(i + 1, n):
            if arr[i] == arr[j]:
                count += 1
        if count > n // 2:
            return arr[i]
        count = 0
    return -1


arr = [1, 3, 3, 3, 2]
n = len(arr)
print(majorityElement(arr, n))
# Time Complexity: O(n^2)
# Space Complexity: O(1)
# Approach: Brute Force
