class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums)==0:
            return 0
        i=0
        for j in range(1,len(nums)):
            if nums[i]!=nums[j]:
                i+=1
                nums[i]=nums[j]
        return i+1


if __name__ == '__main__':
    nums = [1, 2, 2, 3, 4, 4, 5, 6]
    idx = Solution().removeDuplicates(nums)
    print(", ".join(map(str, nums[:idx])))