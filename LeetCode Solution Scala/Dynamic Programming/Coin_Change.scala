object Solution {
    def coinChange(coins: Array[Int], amount: Int): Int = {
        var dp = Array.fill(amount+1)(amount + 1)
        dp(0) = 0
        for(a <- 1 to amount) {
            for(c <- coins) {
                if (a - c >= 0) {
                    dp(a) = Math.min(dp(a), 1 + dp(a - c));
                }
            }
        }
        if (dp(amount) != amount+1){
            dp(amount)
        } 
        else {    
        -1
        }
    }
}