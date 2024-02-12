object Solution {
    def lengthOfLongestSubstring(s: String): Int = {
        var l = 0
        var r = 1
        var max_length = 0
        while (l < r && l < s.length && r < s.length){
            if (r < s.length && s(l) != s(r)){
                r += 1
            }
            else {
                max_length = Math.max(r - l + 1, max_length)
                l += 1
            }
        }
        max_length
    }
}