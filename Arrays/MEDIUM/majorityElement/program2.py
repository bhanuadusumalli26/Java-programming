from collections import Counter


def majorityElement(arr):
    count = Counter(arr)
    for num in count:
        if count[num] > len(arr) // 2:
            return num
    return -1


arr = [1, 2, 3, 2, 2, 2, 5, 4, 2]
print(majorityElement(arr))
# TimeComplexity:O(n)
# SpaceComplexity:O(n)
# Approach:Using Counter
