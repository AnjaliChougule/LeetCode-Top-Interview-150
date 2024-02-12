object Solution {
    def threeSum(nums: Array[Int]): List[List[Int]] = {
        var result: List[List[Int]] = List()
        var sorted_nums = nums.sorted
        var sum = 0
        for(i <- 0 until sorted_nums.length-1){
            var l = i + 1
            var r = sorted_nums.length - 1
            while (l < r) {
                while (nums(l) == nums(l+1)){
                    l += 1
                }
                while (nums(r) == nums(r-1)){
                    r -= 1
                }
                sum = sorted_nums(i) + sorted_nums(l) + sorted_nums(r)
                if (sum > 0){
                    r -= 1
                }
                else if(sum < 0){
                    l += 1
                }
                else{
                    result =  List(sorted_nums(i), sorted_nums(l), sorted_nums(r)) :: result
                }
            }
        }
        result
    }
}