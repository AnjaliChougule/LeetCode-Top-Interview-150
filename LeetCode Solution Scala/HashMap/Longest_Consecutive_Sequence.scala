object Solution {
    def longestConsecutive(nums: Array[Int]): Int = {
        val numSet = nums.toSet
        var longest = 0
        for (n <- nums) {
            if (!numSet.contains(n - 1)) {
                var length = 0
                while (numSet.contains(n + length)) {
                    length += 1
                }
                longest = math.max(length, longest)
            }
        }
        longest
    }
}