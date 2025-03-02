package Array;
public class Buy_sell {
    public static int buySellStock(int prices[]){
        int BuyPrice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0; i<prices.length; i++){
            // if buying prices small hai selling price se to profit hoga
            if(BuyPrice <prices[i]){
                int profit=prices[i]-BuyPrice; // today profit 
                maxprofit=Math.max(maxprofit, profit);
            }else{
                BuyPrice=prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args){
        int prices[]={7,1,5,3,6,4};
        System.out.println(buySellStock(prices));
    }
}
