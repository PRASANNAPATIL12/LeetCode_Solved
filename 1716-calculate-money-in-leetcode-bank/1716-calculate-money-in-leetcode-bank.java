class Solution {
    public int totalMoney(int n) {
        if(n==0) return n;
        int  q=n/7;
        int s=0;
        for(int i=1;i<=q;i++){
            s+=7*(i+3);
        }
       for(int i=7*q;i<n;i++){
           s+=++q;
       }
        return s;
        
    }
}
