public class MaxProfit {
    public  static int maxProfit(int[] prices) {
        int x=prices[0];
        int fark=0;
        for (int i=1;i<prices.length;i++){
            if(prices[i]<x) x=prices[i];
            if(prices[i]>x){
                if(prices[i]-x >fark) {
                    fark=prices[i]-x;
                }
            }
        }
        return fark;
    }
}
