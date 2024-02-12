object Solution {
    def search(nums: Array[Int], target: Int): Int = {
        var l = 0
        var r = nums.length - 1
        while (l <= r){
            var mid = (l + r) / 2
            if (target == nums(mid)){
                return mid
            }
            // search in left sorted portion
            if (nums(l) <= nums(mid)){
                if (target > nums(mid) || target < nums(l)){
                    l = mid + 1
                }
                else{
                    r = mid - 1
                }
            }
            // search in right sorted portion
            else {
                if (target < nums(mid) || target > nums(r)){
                    r = mid - 1
                }
                else{
                    l = mid + 1
                }
            }
        }
        -1
    }
}