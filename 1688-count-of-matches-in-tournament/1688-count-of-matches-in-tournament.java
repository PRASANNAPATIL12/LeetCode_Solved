class Solution {
    public int numberOfMatches(int n) {
        int matches=0;
        while(n!=1){
            if(n%2==0){
                matches+=n/2;
                n/=2;
            }
            if(n%2==1){
                int odd=((n-1)/2);
                matches+=odd;
                n=odd+1;
                
            }
        }
        return matches;
    }
}