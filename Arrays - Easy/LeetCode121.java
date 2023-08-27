// 121. Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {

        int curr = prices[0];

        int maxPro = Integer.MIN_VALUE;

        for(int price : prices){

            int currPro = price - curr;

            maxPro = Math.max(maxPro, currPro);

            curr = Math.min(curr, price);

        }

        return maxPro;
        
    }
}
