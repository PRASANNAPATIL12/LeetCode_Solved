class Solution {
    public int maxProfit(int[] prices) {
        int p=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            
            p=Math.max(p,prices[i]-min);
            min=Math.min(min,prices[i]);
            
          
        }
        return p;
        
        
    }
}