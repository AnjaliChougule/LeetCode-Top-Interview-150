object Solution {
    def maxProfit(prices: Array[Int]): Int = {
            var minPrice = Int.MaxValue
            var maxProfit = 0
            for (price <- prices) {
                minPrice = Math.min(minPrice, price)
                maxProfit = Math.max(maxProfit, price - minPrice)
            }
            maxProfit
    }
}