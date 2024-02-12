object Solution {
    def searchInsert(nums: Array[Int], target: Int): Int = {
        var left = 0
        var right = nums.length - 1
        var mid = 0
        while (left <= right){
            mid = (left + right) / 2
            if (target < nums(mid)){
                right = mid - 1
            }
            else if (target > nums(mid)){
                left = mid + 1
            }
            else{
                return mid
            }
        }
        left
    }
}