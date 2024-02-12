object Solution {
    def minDistance(word1: String, word2: String): Int = {
        val dp = Array.ofDim[Int](word1.length, word2.length).map(_.map(_ => -1))
 
        def minoperation(ind1: Int, ind2: Int, word1: String, word2: String, dp: Array[Array[Int]]): Int ={
            if(ind1 > word1.length-1)
                return word2.length - ind2
           
            if(ind2 > word2.length-1)
                return word1.length- ind1
           
            if(dp(ind1)(ind2) != -1)
                return dp(ind1)(ind2)
 
            if(word1.charAt(ind1)== word2.charAt(ind2)){
                dp(ind1)(ind2) = 0 + minoperation(ind1+1, ind2+1, word1, word2, dp);
                return dp(ind1)(ind2)
            }
            else{
                var delete = 1 + minoperation(ind1+1, ind2, word1, word2, dp)
               
                var replace = 1 + minoperation(ind1+1, ind2+1, word1, word2, dp)
               
                var insert = 1 + minoperation(ind1, ind2+1, word1, word2, dp)
 
                dp(ind1)(ind2) = Math.min(delete, Math.min(replace, insert))
 
                return dp(ind1)(ind2)
            }
        }
        minoperation(0, 0, word1, word2, dp)
    }
}