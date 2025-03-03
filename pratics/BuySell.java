package pratics;
public class BuySell {
    public static int Stock(int prices[]){
        int minBuy=prices[0]; // first day only buy ho sakta hai
        int maxProfit=0;
        for(int i=1; i<prices.length-1; i++){
            if(minBuy<prices[i]){
                int profit=prices[i]-minBuy;
                maxProfit =Math.max(maxProfit, profit);
            }else{
                minBuy=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int prices[]={7,1,3,5,6,4};
        System.out.println(Stock(prices));
    }
}
