class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        f = 0
        l = len(numbers) - 1
        result = []
        sum = 0
        while(f<l):
            sum = numbers[f] + numbers[l]
            if (sum == target):
                result.append(f+1)
                result.append(l+1)
                return result
            elif (sum < target):
                f+=1
            else:
                l-=1



 result = []
    smaller_indices = [-1] *len(stockData)
    stack = []
    for i in range(len(stockData)):
        while stack and stockData[stack[-1]] > stockData[i]:
            smaller_indices[stack.pop()] = i
        stack.append(i)
    for q in queries:
        index = q-2
        if index>=0:
            result.append(smaller_indices[index] + 1)
        else:
            result.append(-1)