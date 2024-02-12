object Solution {
    def findMin(nums: Array[Int]): Int = {
        var l = 0
        var r = nums.length - 1
        var mid = (l+r) / 2
        var min_value = Int.MaxValue
        while (l <= r){
            mid = (l + r) / 2
            if (nums(mid) <= nums(r)){
                r = mid - 1
            }
            else if (nums(mid) >= nums(r)){
                l = mid + 1
            }
            min_value = Math.min(nums(mid), min_value)  
        }
        min_value
    }
}