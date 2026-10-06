class Solution {
    public int maxProfit(int[] prices) {
        
        int minprice = prices[0];
        int maxprofit = 0;

        for(int i=1 ; i<prices.length ; i++){

            if(prices[i] < minprice){
                minprice = prices[i];
            }

            int profit = prices[i] - minprice;

            if(profit > maxprofit){
                maxprofit = profit ;

            }


        }
        return maxprofit;
    }
}
// another version with advanced for loop and math.max , math.min method.
// int minprice = Interger.MAX_VALUE;
// int maxprofit = 0;
// for(int price : prices)
// {
//      minprice = Math.min(minprice , price);
//      maxprofit = Math.max(maxprofit, price-maxprice); 
// }
//  return maxprofit;
// } }