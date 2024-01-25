class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i=1; i<prices.length; i++){
            if (prices[i] > prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }

    public static void main(String[] args){
        int []nums =  {7, 1, 5, 3, 6, 4}
        int result = maxProfit(nums)
        System.out.println(result)
    }
}
