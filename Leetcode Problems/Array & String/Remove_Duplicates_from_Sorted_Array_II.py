class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if (len(nums) <= 2):
            return len(nums)
        k = 2
        for i in range(2,len(nums)):
            if (nums[i] != nums[k-2]  or  nums[i] != nums[k-1] ):
                nums[k] = nums[i]
                k+=1
        return k

if __name__ == '__main__':
    nums = [1,1,1,2,2,3]
    idx = Solution().removeDuplicates(nums)
    print(idx)
    print(", ".join(map(str, nums[:idx])))     