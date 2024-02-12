object Solution {
    def canConstruct(ransomNote: String, magazine: String): Boolean = {
        
        if (ransomNote.length > magazine.length) false
        var temp = ransomNote.toCharArray.diff(magazine.toCharArray)
        if (temp.length == 0) true
        else false     
    }
}