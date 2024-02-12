object Solution {
    def maxProfit(prices: Array[Int], fee: Int): Int = {
        var buy = 0
        var sell = 1
        var profit = 0
        var max_profit = 0
        while (buy < prices.length && sell < prices.length) {
            profit = prices(sell) - prices(buy) - fee
            if (prices(sell) > prices(buy) && profit > 0){
                    max_profit += profit 
                    buy = sell + 1
                    sell = buy + 1      
            }
            else {
            sell = sell + 1
            }
        }
        max_profit
    }
}