object Solution {
    def rob(nums: Array[Int]): Int = {
       var rob1 = 0
       var rob2 = 0
       for (n <- nums){
           var temp = (n + rob1).max(rob2)
           rob1 = rob2
           rob2 = temp
       }
       rob2
    }
}