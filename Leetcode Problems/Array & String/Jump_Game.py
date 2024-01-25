class Solution:
    def canJump(self, nums: List[int]) -> bool:
        max_jump = 0
        for n in nums:
            if max_jump < 0:
                return False
            elif n > max_jump:
                max_jump = n
            max_jump -= 1
            
        return True
    
if __name__ == '__main__':
    nums = [3,2,1,0,4]
    print(Solution().canJump(nums))
    
        