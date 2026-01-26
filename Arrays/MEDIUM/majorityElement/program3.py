def majorityElement(Arr):
    count = 0
    element = None
    n = len(Arr)
    for i in range(n):
        if count == 0:
            count = 1
            element = Arr[i]
        elif Arr[i] == element:
            count += 1
        else:
            count -= 1
    count1 = 0
    for i in range(n):
        if Arr[i] == element:
            count1 += 1
    if count1 > (n / 2):
        return element
    return -1


Arr = [2, 2, 1, 1, 1, 2, 2]
n = len(Arr)
print(majorityElement(Arr))
# TimeComplexity: O(n)
# SpaceComplexity: O(1)
# Boyer-Moore Voting Algorithm
