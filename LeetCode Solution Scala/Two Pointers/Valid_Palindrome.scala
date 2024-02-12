object Solution {
    def isPalindrome(s: String): Boolean = {
        var l = 0;
        var r = s.length() - 1;
        while (l < r) {
            if (!s(l).isLetterOrDigit){
                l += 1
            }
            else if (!s(r).isLetterOrDigit){
                r -= 1
            }
            else if (s(l).toLower == s(r).toLower){
                l += 1
                r -= 1
            }
            else {
                return false
            }
        }
        return true
    }
}