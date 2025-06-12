package pratics;

public class BuySell {
    static int buyAndSellStock(int prices[]) {
        int BuyPrice=prices[0];
        int maxprofit=0;
        for(int i=0; i<prices.length; i++){
            if(BuyPrice<prices[i]){  // profit day
                int profit=prices[i]-BuyPrice;
                maxprofit=Math.max(maxprofit, profit);
            }else{
                BuyPrice=prices[i];    // when BuyPrice > sellingPrices then only buy
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 3, 5, 6, 4 };
        System.out.println(buyAndSellStock(prices));
    }
}
