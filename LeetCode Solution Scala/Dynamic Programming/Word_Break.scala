object Solution {
    def wordBreak(s: String, wordDict: List[String]): Boolean = {
            
        val cache: Array[Int] = Array.fill[Int](s.length)(-1)
        
        wordBreakBase(0, s, wordDict, cache)
    }

    private def wordBreakBase(index: Int, s: String, wordDict: List[String], cache: Array[Int]): Boolean = {

        if (index >= s.length) {
        return true
        }
        
        if (cache(index) != -1) {
        if (cache(index) == 1) {
            return true
        }
        return false
        }

        for (w <- wordDict) {
        if (s.startsWith(w, index) && wordBreakBase(index + w.length, s, wordDict, cache)) {
            cache(index) = 1
            return true
        }
        }
        cache(index) = 0
        false
    }
}